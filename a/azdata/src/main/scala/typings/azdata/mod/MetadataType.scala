package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataType extends StObject
@JSImport("azdata", "MetadataType")
@js.native
object MetadataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataType & Double] = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with MetadataType
  /* 3 */ val Function: typings.azdata.mod.MetadataType.Function & Double = js.native
  
  @js.native
  sealed trait SProc
    extends StObject
       with MetadataType
  /* 2 */ val SProc: typings.azdata.mod.MetadataType.SProc & Double = js.native
  
  @js.native
  sealed trait Table
    extends StObject
       with MetadataType
  /* 0 */ val Table: typings.azdata.mod.MetadataType.Table & Double = js.native
  
  @js.native
  sealed trait View
    extends StObject
       with MetadataType
  /* 1 */ val View: typings.azdata.mod.MetadataType.View & Double = js.native
}
