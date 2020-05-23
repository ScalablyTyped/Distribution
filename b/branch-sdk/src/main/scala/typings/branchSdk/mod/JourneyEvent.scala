package typings.branchSdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JourneyEvent extends js.Object

@JSImport("branch-sdk", "JourneyEvent")
@js.native
object JourneyEvent extends js.Object {
  @js.native
  sealed trait didCallJourneyClose extends JourneyEvent
  
  @js.native
  sealed trait didClickJourneyCTA extends JourneyEvent
  
  @js.native
  sealed trait didClickJourneyClose extends JourneyEvent
  
  @js.native
  sealed trait didCloseJourney extends JourneyEvent
  
  @js.native
  sealed trait didShowJourney extends JourneyEvent
  
  @js.native
  sealed trait willCloseJourney extends JourneyEvent
  
  @js.native
  sealed trait willNotShowJourney extends JourneyEvent
  
  @js.native
  sealed trait willShowJourney extends JourneyEvent
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JourneyEvent with String] = js.native
  /* "didCallJourneyClose" */ @js.native
  object didCallJourneyClose extends TopLevel[didCallJourneyClose with String]
  
  /* "didClickJourneyCTA" */ @js.native
  object didClickJourneyCTA extends TopLevel[didClickJourneyCTA with String]
  
  /* "didClickJourneyClose" */ @js.native
  object didClickJourneyClose extends TopLevel[didClickJourneyClose with String]
  
  /* "didCloseJourney" */ @js.native
  object didCloseJourney extends TopLevel[didCloseJourney with String]
  
  /* "didShowJourney" */ @js.native
  object didShowJourney extends TopLevel[didShowJourney with String]
  
  /* "willCloseJourney" */ @js.native
  object willCloseJourney extends TopLevel[willCloseJourney with String]
  
  /* "willNotShowJourney" */ @js.native
  object willNotShowJourney extends TopLevel[willNotShowJourney with String]
  
  /* "willShowJourney" */ @js.native
  object willShowJourney extends TopLevel[willShowJourney with String]
  
}

