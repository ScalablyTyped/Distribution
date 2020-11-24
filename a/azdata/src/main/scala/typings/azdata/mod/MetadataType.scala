package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataType extends js.Object
@JSImport("azdata", "MetadataType")
@js.native
object MetadataType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataType with Double] = js.native
  
  @js.native
  sealed trait Function extends MetadataType
  /* 3 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  @js.native
  sealed trait SProc extends MetadataType
  /* 2 */ @js.native
  object SProc extends TopLevel[SProc with Double]
  
  @js.native
  sealed trait Table extends MetadataType
  /* 0 */ @js.native
  object Table extends TopLevel[Table with Double]
  
  @js.native
  sealed trait View extends MetadataType
  /* 1 */ @js.native
  object View extends TopLevel[View with Double]
}
