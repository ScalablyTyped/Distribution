package typings.cypress.Mocha.reporters.Base

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default color map
  *
  * @see https://mochajs.org/api/module-base#.colors
  */
trait ColorMap extends /* key */ StringDictionary[Double] {
  var `bright fail`: Double
  var `bright pass`: Double
  var `bright yellow`: Double
  var checkmark: Double
  var `diff added`: Double
  var `diff gutter`: Double
  var `diff removed`: Double
  var `error message`: Double
  var `error stack`: Double
  var `error title`: Double
  var fail: Double
  var fast: Double
  var green: Double
  var light: Double
  var medium: Double
  // added by Base
  var pass: Double
  var pending: Double
  // added by Landing
  var plane: Double
  var `plane crash`: Double
  // added by Progress
  var progress: Double
  var runway: Double
  var slow: Double
  var suite: Double
}

object ColorMap {
  @scala.inline
  def apply(
    `bright fail`: Double,
    `bright pass`: Double,
    `bright yellow`: Double,
    checkmark: Double,
    `diff added`: Double,
    `diff gutter`: Double,
    `diff removed`: Double,
    `error message`: Double,
    `error stack`: Double,
    `error title`: Double,
    fail: Double,
    fast: Double,
    green: Double,
    light: Double,
    medium: Double,
    pass: Double,
    pending: Double,
    plane: Double,
    `plane crash`: Double,
    progress: Double,
    runway: Double,
    slow: Double,
    suite: Double,
    StringDictionary: /* key */ StringDictionary[Double] = null
  ): ColorMap = {
    val __obj = js.Dynamic.literal(checkmark = checkmark, fail = fail, fast = fast, green = green, light = light, medium = medium, pass = pass, pending = pending, plane = plane, progress = progress, runway = runway, slow = slow, suite = suite)
    __obj.updateDynamic("bright fail")(`bright fail`)
    __obj.updateDynamic("bright pass")(`bright pass`)
    __obj.updateDynamic("bright yellow")(`bright yellow`)
    __obj.updateDynamic("diff added")(`diff added`)
    __obj.updateDynamic("diff gutter")(`diff gutter`)
    __obj.updateDynamic("diff removed")(`diff removed`)
    __obj.updateDynamic("error message")(`error message`)
    __obj.updateDynamic("error stack")(`error stack`)
    __obj.updateDynamic("error title")(`error title`)
    __obj.updateDynamic("plane crash")(`plane crash`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ColorMap]
  }
}

