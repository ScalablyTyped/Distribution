package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DatabaseEngineEdition extends js.Object

@JSImport("azdata", "DatabaseEngineEdition")
@js.native
object DatabaseEngineEdition extends js.Object {
  @js.native
  sealed trait Enterprise extends DatabaseEngineEdition
  
  @js.native
  sealed trait Express extends DatabaseEngineEdition
  
  @js.native
  sealed trait Personal extends DatabaseEngineEdition
  
  @js.native
  sealed trait SqlDataWarehouse extends DatabaseEngineEdition
  
  @js.native
  sealed trait SqlDatabase extends DatabaseEngineEdition
  
  @js.native
  sealed trait SqlManagedInstance extends DatabaseEngineEdition
  
  @js.native
  sealed trait SqlOnDemand extends DatabaseEngineEdition
  
  @js.native
  sealed trait SqlStretchDatabase extends DatabaseEngineEdition
  
  @js.native
  sealed trait Standard extends DatabaseEngineEdition
  
  @js.native
  sealed trait Unknown extends DatabaseEngineEdition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseEngineEdition with Double] = js.native
  /* 3 */ @js.native
  object Enterprise extends TopLevel[Enterprise with Double]
  
  /* 4 */ @js.native
  object Express extends TopLevel[Express with Double]
  
  /* 1 */ @js.native
  object Personal extends TopLevel[Personal with Double]
  
  /* 6 */ @js.native
  object SqlDataWarehouse extends TopLevel[SqlDataWarehouse with Double]
  
  /* 5 */ @js.native
  object SqlDatabase extends TopLevel[SqlDatabase with Double]
  
  /* 8 */ @js.native
  object SqlManagedInstance extends TopLevel[SqlManagedInstance with Double]
  
  /* 11 */ @js.native
  object SqlOnDemand extends TopLevel[SqlOnDemand with Double]
  
  /* 7 */ @js.native
  object SqlStretchDatabase extends TopLevel[SqlStretchDatabase with Double]
  
  /* 2 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

