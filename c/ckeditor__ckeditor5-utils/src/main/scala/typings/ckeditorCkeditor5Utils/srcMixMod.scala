package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.Instantiable1
import typings.std.ConstructorParameters
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMixMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/mix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(baseClass: js.Function, mixins: js.Object*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(baseClass.asInstanceOf[js.Any]).`++`(mixins.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  type Constructor[Instance] = Instantiable1[/* args (repeated) */ Any, Instance]
  
  @js.native
  trait Mixed[Base /* <: Constructor[js.Object] */, Mixin /* <: js.Object */]
    extends StObject
       with Instantiable1[/* args */ ConstructorParameters[Base], InstanceType[Base] & Mixin]
}
