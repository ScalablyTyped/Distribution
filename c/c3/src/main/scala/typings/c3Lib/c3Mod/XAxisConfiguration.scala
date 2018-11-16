package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait XAxisConfiguration extends js.Object {
  /**
       * Set category names on category axis.
       * This must be an array that includes category names in string. If category names are included in the date by data.x option, this is not required.
       */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Set default extent for subchart and zoom. This can be an array or function that returns an array.
       */
  var extent: js.UndefOr[js.Array[scala.Double] | js.Function0[js.Array[scala.Double]]] = js.undefined
  /**
       * Set height of x axis.
       * The height of x axis can be set manually by this option. If you need more space for x axis, please use this option for that. The unit is pixel.
       */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
       * Set label on x axis.
       * You can set x axis label and change its position by this option. string and object can be passed and we can change the poisiton by passing object that has position key. Available position
       * differs according to the axis direction (vertical or horizontal). If string set, the position will be the default.
       * Valid horizontal positions: inner-right (Default), inner-center, inner-left, outer-right, outer-center, outer-left
       * Valid vertical positions: inner-top, inner-middle, inner-bottom, outer-top, outer-middle, outer-bottom
       */
  var label: js.UndefOr[java.lang.String | c3Lib.Anon_Text] = js.undefined
  /**
       * Set how to treat the timezone of x values.
       * If true, treat x value as localtime. If false, convert to UTC internally.
       */
  var localtime: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set max value of x axis range.
       */
  var max: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  /**
       * Set min value of x axis range.
       */
  var min: js.UndefOr[java.lang.String | scala.Double | stdLib.Date] = js.undefined
  /**
       * Set padding for x axis.
       * If this option is set, the range of x axis will increase/decrease according to the values. If no padding is needed in the ragen of x axis, 0 should be set. On category axis, this option
       * will be ignored.
       */
  var padding: js.UndefOr[c3Lib.Anon_Left] = js.undefined
  /**
       * Show or hide x axis.
       */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var tick: js.UndefOr[XTickConfiguration] = js.undefined
  /**
       * Set type of x axis (timeseries, category, indexed)
       */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

