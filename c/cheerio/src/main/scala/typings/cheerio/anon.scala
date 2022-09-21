package typings.cheerio

import org.scalablytyped.runtime.StringDictionary
import typings.domelementtype.mod.ElementType.Script
import typings.domelementtype.mod.ElementType.Style
import typings.domelementtype.mod.ElementType.Tag
import typings.domhandler.libNodeMod.ChildNode
import typings.domhandler.libNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: Node */](): T = js.native
    def apply[T /* <: Node */](recursive: Boolean): T = js.native
  }
  
  @js.native
  trait FnCallNameAttribsChildrenType extends StObject {
    
    def apply(children: js.Array[ChildNode]): Any = js.native
    def apply(name: String, attribs: StringDictionary[String]): Any = js.native
    def apply(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode]): Any = js.native
    def apply(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Script): Any = js.native
    def apply(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Style): Any = js.native
    def apply(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Tag): Any = js.native
    def apply(name: String, attribs: StringDictionary[String], children: Unit, `type`: Script): Any = js.native
    def apply(name: String, attribs: StringDictionary[String], children: Unit, `type`: Style): Any = js.native
    def apply(name: String, attribs: StringDictionary[String], children: Unit, `type`: Tag): Any = js.native
  }
  
  @js.native
  trait FnCallStartEnd[T] extends StObject {
    
    def apply(): js.Array[T] = js.native
    def apply(start: Double): js.Array[T] = js.native
    def apply(start: Double, end: Double): js.Array[T] = js.native
    def apply(start: Unit, end: Double): js.Array[T] = js.native
  }
}
