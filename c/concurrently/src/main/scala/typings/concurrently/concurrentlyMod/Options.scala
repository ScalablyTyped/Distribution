package typings.concurrently.concurrentlyMod

import typings.concurrently.concurrentlyStrings.command
import typings.concurrently.concurrentlyStrings.failure
import typings.concurrently.concurrentlyStrings.first
import typings.concurrently.concurrentlyStrings.index
import typings.concurrently.concurrentlyStrings.last
import typings.concurrently.concurrentlyStrings.name
import typings.concurrently.concurrentlyStrings.none
import typings.concurrently.concurrentlyStrings.pid
import typings.concurrently.concurrentlyStrings.success
import typings.concurrently.concurrentlyStrings.time
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultInputTarget: js.UndefOr[Double] = js.undefined
  var inputStream: js.UndefOr[ReadableStream] = js.undefined
  var killOthers: js.UndefOr[js.Array[success | failure]] = js.undefined
  var outputStream: js.UndefOr[WritableStream] = js.undefined
  var prefix: js.UndefOr[index | pid | time | command | name | none | String] = js.undefined
  var prefixLength: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var restartDelay: js.UndefOr[Double] = js.undefined
  var restartTries: js.UndefOr[Double] = js.undefined
  var successCondition: js.UndefOr[first | last] = js.undefined
  var timestampFormat: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultInputTarget: Int | Double = null,
    inputStream: ReadableStream = null,
    killOthers: js.Array[success | failure] = null,
    outputStream: WritableStream = null,
    prefix: index | pid | time | command | name | none | String = null,
    prefixLength: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    restartDelay: Int | Double = null,
    restartTries: Int | Double = null,
    successCondition: first | last = null,
    timestampFormat: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultInputTarget != null) __obj.updateDynamic("defaultInputTarget")(defaultInputTarget.asInstanceOf[js.Any])
    if (inputStream != null) __obj.updateDynamic("inputStream")(inputStream)
    if (killOthers != null) __obj.updateDynamic("killOthers")(killOthers)
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixLength != null) __obj.updateDynamic("prefixLength")(prefixLength.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (restartDelay != null) __obj.updateDynamic("restartDelay")(restartDelay.asInstanceOf[js.Any])
    if (restartTries != null) __obj.updateDynamic("restartTries")(restartTries.asInstanceOf[js.Any])
    if (successCondition != null) __obj.updateDynamic("successCondition")(successCondition.asInstanceOf[js.Any])
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat)
    __obj.asInstanceOf[Options]
  }
}

