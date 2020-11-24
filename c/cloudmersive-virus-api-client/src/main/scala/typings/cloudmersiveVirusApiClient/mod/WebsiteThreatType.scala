package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebsiteThreatType extends js.Object
@JSImport("cloudmersive-virus-api-client", "WebsiteThreatType")
@js.native
object WebsiteThreatType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebsiteThreatType with String] = js.native
  
  @js.native
  sealed trait ForcedDownload extends WebsiteThreatType
  /* "ForcedDownload" */ @js.native
  object ForcedDownload extends TopLevel[ForcedDownload with String]
  
  @js.native
  sealed trait Malware extends WebsiteThreatType
  /* "Malware" */ @js.native
  object Malware extends TopLevel[Malware with String]
  
  @js.native
  sealed trait None extends WebsiteThreatType
  /* "None" */ @js.native
  object None extends TopLevel[None with String]
  
  @js.native
  sealed trait Phising extends WebsiteThreatType
  /* "Phishing" */ @js.native
  object Phising extends TopLevel[Phising with String]
  
  @js.native
  sealed trait UnableToConnect extends WebsiteThreatType
  /* "UnableToConnect" */ @js.native
  object UnableToConnect extends TopLevel[UnableToConnect with String]
}
