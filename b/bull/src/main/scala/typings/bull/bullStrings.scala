package typings.bull

import typings.bull.mod.JobStatus
import typings.bull.mod.JobStatusClean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bullStrings {
  @js.native
  sealed trait active
    extends JobStatus
       with JobStatusClean
  
  @js.native
  sealed trait bclient extends js.Object
  
  @js.native
  sealed trait cleaned extends js.Object
  
  @js.native
  sealed trait client extends js.Object
  
  @js.native
  sealed trait completed
    extends JobStatus
       with JobStatusClean
  
  @js.native
  sealed trait delayed
    extends JobStatus
       with JobStatusClean
  
  @js.native
  sealed trait drained extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait failed
    extends JobStatus
       with JobStatusClean
  
  @js.native
  sealed trait paused extends js.Object
  
  @js.native
  sealed trait progress extends js.Object
  
  @js.native
  sealed trait removed extends js.Object
  
  @js.native
  sealed trait resumed extends js.Object
  
  @js.native
  sealed trait stalled extends js.Object
  
  @js.native
  sealed trait subscriber extends js.Object
  
  @js.native
  sealed trait wait extends JobStatusClean
  
  @js.native
  sealed trait waiting extends JobStatus
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def bclient: bclient = "bclient".asInstanceOf[bclient]
  @scala.inline
  def cleaned: cleaned = "cleaned".asInstanceOf[cleaned]
  @scala.inline
  def client: client = "client".asInstanceOf[client]
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  @scala.inline
  def delayed: delayed = "delayed".asInstanceOf[delayed]
  @scala.inline
  def drained: drained = "drained".asInstanceOf[drained]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  @scala.inline
  def resumed: resumed = "resumed".asInstanceOf[resumed]
  @scala.inline
  def stalled: stalled = "stalled".asInstanceOf[stalled]
  @scala.inline
  def subscriber: subscriber = "subscriber".asInstanceOf[subscriber]
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
}

