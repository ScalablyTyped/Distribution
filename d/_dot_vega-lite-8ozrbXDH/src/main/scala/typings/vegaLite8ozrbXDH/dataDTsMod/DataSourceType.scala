package typings.vegaLite8ozrbXDH.dataDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataSourceType extends StObject
@JSImport(".vega-lite-8ozrbXDH/build/src/data.d.ts", "DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceType & Double] = js.native
  
  @js.native
  sealed trait Column
    extends StObject
       with DataSourceType
  /* 3 */ val Column: typings.vegaLite8ozrbXDH.dataDTsMod.DataSourceType.Column & Double = js.native
  
  @js.native
  sealed trait Lookup
    extends StObject
       with DataSourceType
  /* 4 */ val Lookup: typings.vegaLite8ozrbXDH.dataDTsMod.DataSourceType.Lookup & Double = js.native
  
  @js.native
  sealed trait Main
    extends StObject
       with DataSourceType
  /* 1 */ val Main: typings.vegaLite8ozrbXDH.dataDTsMod.DataSourceType.Main & Double = js.native
  
  @js.native
  sealed trait Raw
    extends StObject
       with DataSourceType
  /* 0 */ val Raw: typings.vegaLite8ozrbXDH.dataDTsMod.DataSourceType.Raw & Double = js.native
  
  @js.native
  sealed trait Row
    extends StObject
       with DataSourceType
  /* 2 */ val Row: typings.vegaLite8ozrbXDH.dataDTsMod.DataSourceType.Row & Double = js.native
}
