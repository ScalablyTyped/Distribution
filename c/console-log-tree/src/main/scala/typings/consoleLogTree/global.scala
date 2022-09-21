package typings.consoleLogTree

import typings.consoleLogTree.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object library {
    
    @JSGlobal("library")
    @js.native
    val ^ : js.Any = js.native
    
    inline def log(tree: js.Array[Tree]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def log(tree: Tree): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def parse(tree: js.Array[Tree]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parse(tree: js.Array[Tree], parentPre: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any], parentPre.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(tree: js.Array[Tree], parentPre: String, treeStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any], parentPre.asInstanceOf[js.Any], treeStr.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(tree: js.Array[Tree], parentPre: Unit, treeStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any], parentPre.asInstanceOf[js.Any], treeStr.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(tree: Tree): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parse(tree: Tree, parentPre: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any], parentPre.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(tree: Tree, parentPre: String, treeStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any], parentPre.asInstanceOf[js.Any], treeStr.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse(tree: Tree, parentPre: Unit, treeStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tree.asInstanceOf[js.Any], parentPre.asInstanceOf[js.Any], treeStr.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
