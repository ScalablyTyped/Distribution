package typings.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineAggregateResult extends js.Object {
  /**
    * optionally, define idGenerator function for new aggregate ids
    */
  def defineAggregateIdGenerator(cb: js.Function0[String]): DefineAggregateResult = js.native
  def defineAggregateIdGenerator(cb: js.Function1[/* callback */ generateIdCallback, String]): DefineAggregateResult = js.native
  /**
    * optionally, define idGenerator function for new aggregate ids that are command aware
    * if you define it that way, the normal defineAggregateIdGenerator function will be replaced
    */
  def defineCommandAwareAggregateIdGenerator(cb: js.Function2[/* cmd */ Command, /* callback */ js.UndefOr[generateIdCallback], String]): DefineAggregateResult = js.native
  /**
    * optionally, define if snapshot should be ignored
    * if true, the whole event stream will be loaded
    */
  def defineIgnoreSnapshot(version: AggregateVersion): DefineAggregateResult = js.native
  def defineIgnoreSnapshot(version: AggregateVersion, cb: js.Function1[/* data */ js.Any, Boolean]): DefineAggregateResult = js.native
  def defineIgnoreSnapshot(version: AggregateVersion, cb: Boolean): DefineAggregateResult = js.native
  /**
    * optionally, define conversion algorithm for older snapshots
    * always convert directly to newest version...
    * when loaded a snapshot and it's an older snapshot, a new snapshot with same revision but with newer aggregate version will be created
    */
  def defineSnapshotConversion(
    version: AggregateVersion,
    cb: js.Function2[/* data */ js.Any, /* aggregate */ AggregateModel, Unit]
  ): DefineAggregateResult = js.native
  /**
    * optionally, define snapshot need algorithm...
    */
  def defineSnapshotNeed(cb: defineSnapshotNeedHandler): DefineAggregateResult = js.native
}

