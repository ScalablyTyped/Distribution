package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkPaint extends SkObject[SkPaint] {
  def getBlendMode(): SkBlendMode
  def getColor(): SkColor
  def getFilterQuality(): SkFilterQuality
  def getStrokeCap(): SkStrokeCap
  def getStrokeJoin(): SkStrokeJoin
  def getStrokeMiter(): Double
  def getStrokeWidth(): Double
  def setAntiAlias(value: Boolean): Unit
  def setBlendMode(value: SkBlendMode): Unit
  def setColor(value: SkColor): Unit
  def setColorFilter(value: SkColorFilter): Unit
  def setColorf(fRed: Double, fGreen: Double, fBlue: Double, fAlpha: Double): Unit
  def setFilterQuality(value: SkFilterQuality): Unit
  def setImageFilter(value: SkImageFilter): Unit
  def setMaskFilter(value: SkMaskFilter): Unit
  def setPathEffect(value: SkPathEffect): Unit
  def setShader(value: SkShader): Unit
  def setStrokeCap(value: SkStrokeCap): Unit
  def setStrokeJoin(value: SkStrokeJoin): Unit
  def setStrokeMiter(value: Double): Unit
  def setStrokeWidth(value: Double): Unit
  def setStyle(value: SkPaintStyle): Unit
}

object SkPaint {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getBlendMode: () => SkBlendMode,
    getColor: () => SkColor,
    getFilterQuality: () => SkFilterQuality,
    getStrokeCap: () => SkStrokeCap,
    getStrokeJoin: () => SkStrokeJoin,
    getStrokeMiter: () => Double,
    getStrokeWidth: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    setAntiAlias: Boolean => Unit,
    setBlendMode: SkBlendMode => Unit,
    setColor: SkColor => Unit,
    setColorFilter: SkColorFilter => Unit,
    setColorf: (Double, Double, Double, Double) => Unit,
    setFilterQuality: SkFilterQuality => Unit,
    setImageFilter: SkImageFilter => Unit,
    setMaskFilter: SkMaskFilter => Unit,
    setPathEffect: SkPathEffect => Unit,
    setShader: SkShader => Unit,
    setStrokeCap: SkStrokeCap => Unit,
    setStrokeJoin: SkStrokeJoin => Unit,
    setStrokeMiter: Double => Unit,
    setStrokeWidth: Double => Unit,
    setStyle: SkPaintStyle => Unit
  ): SkPaint = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getBlendMode = js.Any.fromFunction0(getBlendMode), getColor = js.Any.fromFunction0(getColor), getFilterQuality = js.Any.fromFunction0(getFilterQuality), getStrokeCap = js.Any.fromFunction0(getStrokeCap), getStrokeJoin = js.Any.fromFunction0(getStrokeJoin), getStrokeMiter = js.Any.fromFunction0(getStrokeMiter), getStrokeWidth = js.Any.fromFunction0(getStrokeWidth), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), setAntiAlias = js.Any.fromFunction1(setAntiAlias), setBlendMode = js.Any.fromFunction1(setBlendMode), setColor = js.Any.fromFunction1(setColor), setColorFilter = js.Any.fromFunction1(setColorFilter), setColorf = js.Any.fromFunction4(setColorf), setFilterQuality = js.Any.fromFunction1(setFilterQuality), setImageFilter = js.Any.fromFunction1(setImageFilter), setMaskFilter = js.Any.fromFunction1(setMaskFilter), setPathEffect = js.Any.fromFunction1(setPathEffect), setShader = js.Any.fromFunction1(setShader), setStrokeCap = js.Any.fromFunction1(setStrokeCap), setStrokeJoin = js.Any.fromFunction1(setStrokeJoin), setStrokeMiter = js.Any.fromFunction1(setStrokeMiter), setStrokeWidth = js.Any.fromFunction1(setStrokeWidth), setStyle = js.Any.fromFunction1(setStyle))
  
    __obj.asInstanceOf[SkPaint]
  }
}

