package typings.awsSdkUtilConfigProvider

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBooleanSelectorMod {
  
  @JSImport("@aws-sdk/util-config-provider/dist-types/booleanSelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SelectorType extends StObject
  @JSImport("@aws-sdk/util-config-provider/dist-types/booleanSelector", "SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SelectorType & String] = js.native
    
    @js.native
    sealed trait CONFIG
      extends StObject
         with SelectorType
    /* "shared config entry" */ val CONFIG: typings.awsSdkUtilConfigProvider.distTypesBooleanSelectorMod.SelectorType.CONFIG & String = js.native
    
    @js.native
    sealed trait ENV
      extends StObject
         with SelectorType
    /* "env" */ val ENV: typings.awsSdkUtilConfigProvider.distTypesBooleanSelectorMod.SelectorType.ENV & String = js.native
  }
  
  inline def booleanSelector(obj: Record[String, js.UndefOr[String]], key: String, `type`: SelectorType): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("booleanSelector")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
}
