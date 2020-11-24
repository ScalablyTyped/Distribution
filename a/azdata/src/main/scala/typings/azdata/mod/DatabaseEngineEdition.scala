package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DatabaseEngineEdition extends js.Object
@JSImport("azdata", "DatabaseEngineEdition")
@js.native
object DatabaseEngineEdition extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseEngineEdition with Double] = js.native
  
  @js.native
  sealed trait Enterprise extends DatabaseEngineEdition
  /* 3 */ @js.native
  object Enterprise extends TopLevel[Enterprise with Double]
  
  @js.native
  sealed trait Express extends DatabaseEngineEdition
  /* 4 */ @js.native
  object Express extends TopLevel[Express with Double]
  
  @js.native
  sealed trait Personal extends DatabaseEngineEdition
  /* 1 */ @js.native
  object Personal extends TopLevel[Personal with Double]
  
  @js.native
  sealed trait SqlDataWarehouse extends DatabaseEngineEdition
  /* 6 */ @js.native
  object SqlDataWarehouse extends TopLevel[SqlDataWarehouse with Double]
  
  @js.native
  sealed trait SqlDatabase extends DatabaseEngineEdition
  /* 5 */ @js.native
  object SqlDatabase extends TopLevel[SqlDatabase with Double]
  
  @js.native
  sealed trait SqlManagedInstance extends DatabaseEngineEdition
  /* 8 */ @js.native
  object SqlManagedInstance extends TopLevel[SqlManagedInstance with Double]
  
  @js.native
  sealed trait SqlOnDemand extends DatabaseEngineEdition
  /* 11 */ @js.native
  object SqlOnDemand extends TopLevel[SqlOnDemand with Double]
  
  @js.native
  sealed trait SqlStretchDatabase extends DatabaseEngineEdition
  /* 7 */ @js.native
  object SqlStretchDatabase extends TopLevel[SqlStretchDatabase with Double]
  
  @js.native
  sealed trait Standard extends DatabaseEngineEdition
  /* 2 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
  @js.native
  sealed trait Unknown extends DatabaseEngineEdition
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
