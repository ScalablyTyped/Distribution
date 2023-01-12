package typings.consoleLogTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("console-log-tree", JSImport.Namespace)
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
  
  trait Tree extends StObject {
    
    var children: js.UndefOr[js.Array[Tree]] = js.undefined
    
    var name: String
  }
  object Tree {
    
    inline def apply(name: String): Tree = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tree] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Tree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Tree*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
