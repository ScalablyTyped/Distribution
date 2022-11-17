package typings.chartJs.mod

import typings.chartJs.anon.End
import typings.chartJs.anon.Move
import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.E
import typings.std.CanvasRenderingContext2D
import typings.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineElement extends E[AnyObject, AnyObject] {
  
  var _chart: Any = js.native
  
  var _datasetIndex: Any = js.native
  
  var _decimated: Boolean = js.native
  
  var _fullLoop: Any = js.native
  
  var _loop: Any = js.native
  
  var _path: Any = js.native
  
  var _points: Any = js.native
  
  var _pointsUpdated: Boolean = js.native
  
  var _segments: js.Array[Segment] = js.native
  
  var animated: Boolean = js.native
  
  /**
    * Draw
    * @param {CanvasRenderingContext2D} ctx
    * @param {object} chartArea
    * @param {number} [start]
    * @param {number} [count]
    */
  def draw(ctx: CanvasRenderingContext2D, chartArea: js.Object): scala.Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, chartArea: js.Object, start: Double): scala.Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, chartArea: js.Object, start: Double, count: Double): scala.Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, chartArea: js.Object, start: scala.Unit, count: Double): scala.Unit = js.native
  
  /**
    * First non-skipped point on this line
    * @returns {PointElement|undefined}
    */
  def first(): js.UndefOr[PointElement] = js.native
  
  /**
    * Interpolate a point in this line at the same value on `property` as
    * the reference `point` provided
    * @param {PointElement} point - the reference point
    * @param {string} property - the property to match on
    * @returns {PointElement|undefined}
    */
  def interpolate(point: PointElement, property: String): js.UndefOr[PointElement] = js.native
  
  /**
    * Last non-skipped point on this line
    * @returns {PointElement|undefined}
    */
  def last(): js.UndefOr[PointElement] = js.native
  
  /**
    * Append all segments of this line to current path.
    * @param {CanvasRenderingContext2D|Path2D} ctx
    * @param {number} [start]
    * @param {number} [count]
    * @returns {undefined|boolean} - true if line is a full loop (path should be closed)
    */
  def path(ctx: CanvasRenderingContext2D): js.UndefOr[Boolean] = js.native
  def path(ctx: CanvasRenderingContext2D, start: Double): js.UndefOr[Boolean] = js.native
  def path(ctx: CanvasRenderingContext2D, start: Double, count: Double): js.UndefOr[Boolean] = js.native
  def path(ctx: CanvasRenderingContext2D, start: scala.Unit, count: Double): js.UndefOr[Boolean] = js.native
  def path(ctx: Path2D): js.UndefOr[Boolean] = js.native
  def path(ctx: Path2D, start: Double): js.UndefOr[Boolean] = js.native
  def path(ctx: Path2D, start: Double, count: Double): js.UndefOr[Boolean] = js.native
  def path(ctx: Path2D, start: scala.Unit, count: Double): js.UndefOr[Boolean] = js.native
  
  /**
    * Append a segment of this line to current path.
    * @param {CanvasRenderingContext2D} ctx
    * @param {object} segment
    * @param {number} segment.start - start index of the segment, referring the points array
    * @param {number} segment.end - end index of the segment, referring the points array
    * @param {boolean} segment.loop - indicates that the segment is a loop
    * @param {object} params
    * @param {boolean} params.move - move to starting point (vs line to it)
    * @param {boolean} params.reverse - path the segment from end to start
    * @param {number} params.start - limit segment to points starting from `start` index
    * @param {number} params.end - limit segment to points ending at `start` + `count` index
    * @returns {undefined|boolean} - true if the segment is a full loop (path should be closed)
    */
  def pathSegment(ctx: CanvasRenderingContext2D, segment: End, params: Move): js.UndefOr[Boolean] = js.native
  
  def points: Any = js.native
  def points_=(arg: Any): scala.Unit = js.native
  
  def segments: js.Array[Segment] = js.native
  
  def updateControlPoints(chartArea: Any, indexAxis: Any): scala.Unit = js.native
}
