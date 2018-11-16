package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait YAxisConfiguration extends js.Object {
  /**
       * Set center value of y axis.
       */
  var center: js.UndefOr[scala.Double] = js.undefined
  /**
       * Set default range of y axis. This option set the default value for y axis when there is no data on init.
       */
  var default: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
       * Show y axis inside of the chart.
       */
  var inner: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Change the direction of y axis.
       * If true set, the direction will be from the top to the bottom.
       */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set label on y axis. This option works in the same way as axis.x.label.
       * Valid horizontal positions: inner-right (Default), inner-center, inner-left, outer-right, outer-center, outer-left
       * Valid vertical positions: inner-top, inner-middle, inner-bottom, outer-top, outer-middle, outer-bottom
       */
  var label: js.UndefOr[java.lang.String | c3Lib.Anon_Text] = js.undefined
  /**
       * Set max value of y axis.
       */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
       * Set min value of y axis.
       */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
       * Set padding for y axis.
       * You can set padding for y axis to create more space on the edge of the axis. This option accepts object and it can include top and bottom. top, bottom will be treated as pixels.
       */
  var padding: js.UndefOr[c3Lib.Anon_Bottom] = js.undefined
  /**
       * Show or hide y axis.
       */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var tick: js.UndefOr[YTickConfiguration] = js.undefined
}

