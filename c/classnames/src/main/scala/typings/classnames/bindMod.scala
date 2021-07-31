package typings.classnames

import org.scalablytyped.runtime.Shortcut
import typings.classnames.typesMod.ClassNamesFn
import typings.classnames.typesMod.ClassValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod extends Shortcut {
  
  @JSImport("classnames/bind", JSImport.Namespace)
  @js.native
  val ^ : ClassNamesBindExport = js.native
  
  @js.native
  trait ClassNamesBind
    extends StObject
       with ClassNamesFn {
    
    def bind(styles: Record[String, String]): ClassNamesFn = js.native
  }
  
  @js.native
  trait ClassNamesBindExport
    extends StObject
       with ClassNamesBind {
    
    def default(classes: ClassValue*): String = js.native
    @JSName("default")
    var default_Original: ClassNamesBind = js.native
  }
  
  type _To = ClassNamesBindExport
  
  /* This means you don't have to write `^`, but can instead just say `bindMod.foo` */
  override def _to: ClassNamesBindExport = ^
}
