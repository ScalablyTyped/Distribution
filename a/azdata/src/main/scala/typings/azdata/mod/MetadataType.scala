package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataType extends StObject
@JSImport("azdata", "MetadataType")
@js.native
object MetadataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataType with Double] = js.native
  
  @js.native
  sealed trait Function extends MetadataType
  /* 3 */ val Function: typings.azdata.mod.MetadataType.Function with Double = js.native
  
  @js.native
  sealed trait SProc extends MetadataType
  /* 2 */ val SProc: typings.azdata.mod.MetadataType.SProc with Double = js.native
  
  @js.native
  sealed trait Table extends MetadataType
  /* 0 */ val Table: typings.azdata.mod.MetadataType.Table with Double = js.native
  
  @js.native
  sealed trait View extends MetadataType
  /* 1 */ val View: typings.azdata.mod.MetadataType.View with Double = js.native
}
