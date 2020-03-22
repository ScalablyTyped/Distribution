package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetadataType extends js.Object

@JSImport("azdata", "MetadataType")
@js.native
object MetadataType extends js.Object {
  @js.native
  sealed trait Function extends MetadataType
  
  @js.native
  sealed trait SProc extends MetadataType
  
  @js.native
  sealed trait Table extends MetadataType
  
  @js.native
  sealed trait View extends MetadataType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataType with Double] = js.native
  /* 3 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  /* 2 */ @js.native
  object SProc extends TopLevel[SProc with Double]
  
  /* 0 */ @js.native
  object Table extends TopLevel[Table with Double]
  
  /* 1 */ @js.native
  object View extends TopLevel[View with Double]
  
}

