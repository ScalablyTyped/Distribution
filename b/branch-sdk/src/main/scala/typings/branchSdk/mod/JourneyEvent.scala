package typings.branchSdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JourneyEvent extends js.Object
@JSImport("branch-sdk", "JourneyEvent")
@js.native
object JourneyEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JourneyEvent with String] = js.native
  
  @js.native
  sealed trait didCallJourneyClose extends JourneyEvent
  /* "didCallJourneyClose" */ @js.native
  object didCallJourneyClose extends TopLevel[didCallJourneyClose with String]
  
  @js.native
  sealed trait didClickJourneyCTA extends JourneyEvent
  /* "didClickJourneyCTA" */ @js.native
  object didClickJourneyCTA extends TopLevel[didClickJourneyCTA with String]
  
  @js.native
  sealed trait didClickJourneyClose extends JourneyEvent
  /* "didClickJourneyClose" */ @js.native
  object didClickJourneyClose extends TopLevel[didClickJourneyClose with String]
  
  @js.native
  sealed trait didCloseJourney extends JourneyEvent
  /* "didCloseJourney" */ @js.native
  object didCloseJourney extends TopLevel[didCloseJourney with String]
  
  @js.native
  sealed trait didShowJourney extends JourneyEvent
  /* "didShowJourney" */ @js.native
  object didShowJourney extends TopLevel[didShowJourney with String]
  
  @js.native
  sealed trait willCloseJourney extends JourneyEvent
  /* "willCloseJourney" */ @js.native
  object willCloseJourney extends TopLevel[willCloseJourney with String]
  
  @js.native
  sealed trait willNotShowJourney extends JourneyEvent
  /* "willNotShowJourney" */ @js.native
  object willNotShowJourney extends TopLevel[willNotShowJourney with String]
  
  @js.native
  sealed trait willShowJourney extends JourneyEvent
  /* "willShowJourney" */ @js.native
  object willShowJourney extends TopLevel[willShowJourney with String]
}
