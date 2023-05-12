package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateModeEnum extends StObject
@JSImport("chart.js/dist/types/index", "UpdateModeEnum")
@js.native
object UpdateModeEnum extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UpdateModeEnum & String] = js.native
  
  @js.native
  sealed trait default
    extends StObject
       with UpdateModeEnum
  /* "default" */ val default: typings.chartJs.distTypesIndexMod.UpdateModeEnum.default & String = js.native
  
  @js.native
  sealed trait active
    extends StObject
       with UpdateModeEnum
  /* "active" */ val active: typings.chartJs.distTypesIndexMod.UpdateModeEnum.active & String = js.native
  
  @js.native
  sealed trait hide
    extends StObject
       with UpdateModeEnum
  /* "hide" */ val hide: typings.chartJs.distTypesIndexMod.UpdateModeEnum.hide & String = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with UpdateModeEnum
  /* "none" */ val none: typings.chartJs.distTypesIndexMod.UpdateModeEnum.none & String = js.native
  
  @js.native
  sealed trait reset
    extends StObject
       with UpdateModeEnum
  /* "reset" */ val reset: typings.chartJs.distTypesIndexMod.UpdateModeEnum.reset & String = js.native
  
  @js.native
  sealed trait resize
    extends StObject
       with UpdateModeEnum
  /* "resize" */ val resize: typings.chartJs.distTypesIndexMod.UpdateModeEnum.resize & String = js.native
  
  @js.native
  sealed trait show
    extends StObject
       with UpdateModeEnum
  /* "show" */ val show: typings.chartJs.distTypesIndexMod.UpdateModeEnum.show & String = js.native
}
