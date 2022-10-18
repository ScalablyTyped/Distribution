package typings.awsSdkUtilConfigProvider

import typings.awsSdkUtilConfigProvider.distTypesBooleanSelectorMod.SelectorType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-config-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/util-config-provider", "SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.awsSdkUtilConfigProvider.distTypesBooleanSelectorMod.SelectorType & String
      ] = js.native
    
    /* "shared config entry" */ val CONFIG: typings.awsSdkUtilConfigProvider.distTypesBooleanSelectorMod.SelectorType.CONFIG & String = js.native
    
    /* "env" */ val ENV: typings.awsSdkUtilConfigProvider.distTypesBooleanSelectorMod.SelectorType.ENV & String = js.native
  }
  
  inline def booleanSelector(obj: Record[String, js.UndefOr[String]], key: String, `type`: SelectorType): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("booleanSelector")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
}
