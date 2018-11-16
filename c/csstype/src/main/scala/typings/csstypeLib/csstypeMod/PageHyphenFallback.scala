package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PageHyphenFallback[TLength] extends js.Object {
  var bleed: js.UndefOr[
    csstypeLib.PageBleedProperty[TLength] | js.Array[csstypeLib.PageBleedProperty[TLength]]
  ] = js.undefined
  var marks: js.UndefOr[csstypeLib.PageMarksProperty | js.Array[csstypeLib.PageMarksProperty]] = js.undefined
}

