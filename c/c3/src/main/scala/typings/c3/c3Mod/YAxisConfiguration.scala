package typings.c3.c3Mod

import typings.c3.Anon_BottomTop
import typings.c3.Anon_Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisConfiguration extends js.Object {
  /**
    * Set center value of y axis.
    */
  var center: js.UndefOr[Double] = js.undefined
  /**
    * Set default range of y axis. This option set the default value for y axis when there is no data on init.
    */
  var default: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Show y axis inside of the chart.
    */
  var inner: js.UndefOr[Boolean] = js.undefined
  /**
    * Change the direction of y axis.
    * If true set, the direction will be from the top to the bottom.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /**
    * Set label on y axis. This option works in the same way as axis.x.label.
    * Valid horizontal positions: inner-right (Default), inner-center, inner-left, outer-right, outer-center, outer-left
    * Valid vertical positions: inner-top, inner-middle, inner-bottom, outer-top, outer-middle, outer-bottom
    */
  var label: js.UndefOr[String | Anon_Position] = js.undefined
  /**
    * Set max value of y axis.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Set min value of y axis.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Set padding for y axis.
    * You can set padding for y axis to create more space on the edge of the axis. This option accepts object and it can include top and bottom. top, bottom will be treated as pixels.
    */
  var padding: js.UndefOr[Anon_BottomTop] = js.undefined
  /**
    * Show or hide y axis.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  var tick: js.UndefOr[YTickConfiguration] = js.undefined
}

object YAxisConfiguration {
  @scala.inline
  def apply(
    center: Int | Double = null,
    default: js.Array[Double] = null,
    inner: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: String | Anon_Position = null,
    max: Int | Double = null,
    min: Int | Double = null,
    padding: Anon_BottomTop = null,
    show: js.UndefOr[Boolean] = js.undefined,
    tick: YTickConfiguration = null
  ): YAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (tick != null) __obj.updateDynamic("tick")(tick)
    __obj.asInstanceOf[YAxisConfiguration]
  }
}

