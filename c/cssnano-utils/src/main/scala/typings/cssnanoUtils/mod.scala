package typings.cssnanoUtils

import typings.cssnanoUtils.cssnanoUtilsBooleans.`true`
import typings.cssnanoUtils.typesSameParentMod.Child
import typings.postcss.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cssnano-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArguments(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_postcss-value-parser.ParsedValue */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_postcss-value-parser.FunctionNode */ Any
  ): js.Array[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_postcss-value-parser.Node */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArguments")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_postcss-value-parser.Node */ Any
    ]
  ]]
  
  object rawCache {
    
    /**
      * @type {import('postcss').PluginCreator<void>}
      * @return {import('postcss').Plugin}
      */
    inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
    
    @JSImport("cssnano-utils", "rawCache")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cssnano-utils", "rawCache.postcss")
    @js.native
    val postcss: `true` = js.native
  }
  
  /** @typedef {import('postcss').AnyNode & {parent?: Child}} Child */
  /**
    * @param {Child} nodeA
    * @param {Child} nodeB
    * @return {boolean}
    */
  inline def sameParent(nodeA: Child, nodeB: Child): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameParent")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
