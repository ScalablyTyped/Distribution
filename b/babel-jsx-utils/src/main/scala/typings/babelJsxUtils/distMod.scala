package typings.babelJsxUtils

import typings.babelCore.mod.NodePath
import typings.babelJsxUtils.anon.Confident
import typings.babelTypes.mod.JSXAttribute_
import typings.babelTypes.mod.JSXIdentifier_
import typings.babelTypes.mod.JSXNamespacedName_
import typings.babelTypes.mod.JSXOpeningElement_
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("babel-jsx-utils/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAttributeValue[T](nodePath: NodePath[JSXAttribute_]): Confident[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValue")(nodePath.asInstanceOf[js.Any]).asInstanceOf[Confident[T]]
  inline def getAttributeValue[T](nodePath: typings.babelTraverse.mod.NodePath[JSXAttribute_]): Confident[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValue")(nodePath.asInstanceOf[js.Any]).asInstanceOf[Confident[T]]
  
  inline def getAttributeValues(nodePath: NodePath[JSXOpeningElement_]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def getAttributeValues(
    nodePath: NodePath[JSXOpeningElement_],
    onError: js.Function2[
      /* attributeName */ String, 
      /* attributePath */ js.UndefOr[NodePath[JSXAttribute_]], 
      Unit
    ]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getAttributeValues(
    nodePath: NodePath[JSXOpeningElement_],
    onError: js.Function2[
      /* attributeName */ String, 
      /* attributePath */ js.UndefOr[NodePath[JSXAttribute_]], 
      Unit
    ],
    include: Set[String]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getAttributeValues(nodePath: NodePath[JSXOpeningElement_], onError: Unit, include: Set[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getAttributeValues(nodePath: typings.babelTraverse.mod.NodePath[JSXOpeningElement_]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def getAttributeValues(
    nodePath: typings.babelTraverse.mod.NodePath[JSXOpeningElement_],
    onError: js.Function2[
      /* attributeName */ String, 
      /* attributePath */ js.UndefOr[NodePath[JSXAttribute_]], 
      Unit
    ]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getAttributeValues(
    nodePath: typings.babelTraverse.mod.NodePath[JSXOpeningElement_],
    onError: js.Function2[
      /* attributeName */ String, 
      /* attributePath */ js.UndefOr[NodePath[JSXAttribute_]], 
      Unit
    ],
    include: Set[String]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getAttributeValues(
    nodePath: typings.babelTraverse.mod.NodePath[JSXOpeningElement_],
    onError: Unit,
    include: Set[String]
  ): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValues")(nodePath.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def parseIdentifier(identifier: JSXIdentifier_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def parseIdentifier(identifier: JSXNamespacedName_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[String]
}
