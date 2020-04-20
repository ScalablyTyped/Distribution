package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebsiteThreatType extends js.Object

@JSImport("cloudmersive-virus-api-client", "WebsiteThreatType")
@js.native
object WebsiteThreatType extends js.Object {
  @js.native
  sealed trait ForcedDownload extends WebsiteThreatType
  
  @js.native
  sealed trait Malware extends WebsiteThreatType
  
  @js.native
  sealed trait None extends WebsiteThreatType
  
  @js.native
  sealed trait Phising extends WebsiteThreatType
  
  @js.native
  sealed trait UnableToConnect extends WebsiteThreatType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebsiteThreatType with String] = js.native
  /* "ForcedDownload" */ @js.native
  object ForcedDownload extends TopLevel[ForcedDownload with String]
  
  /* "Malware" */ @js.native
  object Malware extends TopLevel[Malware with String]
  
  /* "None" */ @js.native
  object None extends TopLevel[None with String]
  
  /* "Phishing" */ @js.native
  object Phising extends TopLevel[Phising with String]
  
  /* "UnableToConnect" */ @js.native
  object UnableToConnect extends TopLevel[UnableToConnect with String]
  
}

