package typings.cheerio

import typings.cheerio.libEsmOptionsMod.InternalOptions
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ParentNode
import typings.domhandler.mod.Document
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmParseMod {
  
  @JSImport("cheerio/lib/esm/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getParse(
    parser: js.Function4[
      /* content */ String, 
      /* options */ InternalOptions, 
      /* isDocument */ Boolean, 
      /* context */ ParentNode | Null, 
      Document
    ]
  ): js.Function4[
    /* content */ String | Document | AnyNode | js.Array[AnyNode] | Buffer, 
    /* options */ InternalOptions, 
    /* isDocument */ Boolean, 
    /* context */ ParentNode | Null, 
    Document
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParse")(parser.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* content */ String | Document | AnyNode | js.Array[AnyNode] | Buffer, 
    /* options */ InternalOptions, 
    /* isDocument */ Boolean, 
    /* context */ ParentNode | Null, 
    Document
  ]]
  
  inline def update(newChilds: js.Array[AnyNode]): ParentNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(newChilds.asInstanceOf[js.Any]).asInstanceOf[ParentNode | Null]
  inline def update(newChilds: js.Array[AnyNode], parent: ParentNode): ParentNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(newChilds.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[ParentNode | Null]
  inline def update(newChilds: AnyNode): ParentNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(newChilds.asInstanceOf[js.Any]).asInstanceOf[ParentNode | Null]
  inline def update(newChilds: AnyNode, parent: ParentNode): ParentNode | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(newChilds.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[ParentNode | Null]
}
