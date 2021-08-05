package typings.bull

import typings.bull.mod.JobStatus
import typings.bull.mod.JobStatusClean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bullStrings {
  
  @js.native
  sealed trait active
    extends StObject
       with JobStatus
       with JobStatusClean
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait bclient extends StObject
  inline def bclient: bclient = "bclient".asInstanceOf[bclient]
  
  @js.native
  sealed trait cleaned extends StObject
  inline def cleaned: cleaned = "cleaned".asInstanceOf[cleaned]
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait completed
    extends StObject
       with JobStatus
       with JobStatusClean
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait delayed
    extends StObject
       with JobStatus
       with JobStatusClean
  inline def delayed: delayed = "delayed".asInstanceOf[delayed]
  
  @js.native
  sealed trait drained extends StObject
  inline def drained: drained = "drained".asInstanceOf[drained]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failed
    extends StObject
       with JobStatus
       with JobStatusClean
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait paused
    extends StObject
       with JobStatus
       with JobStatusClean
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait progress extends StObject
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait removed extends StObject
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait resumed extends StObject
  inline def resumed: resumed = "resumed".asInstanceOf[resumed]
  
  @js.native
  sealed trait stalled extends StObject
  inline def stalled: stalled = "stalled".asInstanceOf[stalled]
  
  @js.native
  sealed trait subscriber extends StObject
  inline def subscriber: subscriber = "subscriber".asInstanceOf[subscriber]
  
  @js.native
  sealed trait wait
    extends StObject
       with JobStatusClean
  
  @js.native
  sealed trait waiting
    extends StObject
       with JobStatus
  inline def waiting: waiting = "waiting".asInstanceOf[waiting]
}
