package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkPaint extends SkObject[SkPaint] {
  def getBlendMode(): SkBlendMode = js.native
  def getColor(): SkColor = js.native
  def getFilterQuality(): SkFilterQuality = js.native
  def getStrokeCap(): SkStrokeCap = js.native
  def getStrokeJoin(): SkStrokeJoin = js.native
  def getStrokeMiter(): Double = js.native
  def getStrokeWidth(): Double = js.native
  def setAntiAlias(value: Boolean): Unit = js.native
  def setBlendMode(value: SkBlendMode): Unit = js.native
  def setColor(value: SkColor): Unit = js.native
  def setColorFilter(value: SkColorFilter): Unit = js.native
  def setColorf(fRed: Double, fGreen: Double, fBlue: Double, fAlpha: Double): Unit = js.native
  def setFilterQuality(value: SkFilterQuality): Unit = js.native
  def setImageFilter(value: SkImageFilter): Unit = js.native
  def setMaskFilter(value: SkMaskFilter): Unit = js.native
  def setPathEffect(value: SkPathEffect): Unit = js.native
  def setShader(value: SkShader): Unit = js.native
  def setStrokeCap(value: SkStrokeCap): Unit = js.native
  def setStrokeJoin(value: SkStrokeJoin): Unit = js.native
  def setStrokeMiter(value: Double): Unit = js.native
  def setStrokeWidth(value: Double): Unit = js.native
  def setStyle(value: SkPaintStyle): Unit = js.native
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
  @scala.inline
  implicit class SkPaintOps[Self <: SkPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBlendMode(value: () => SkBlendMode): Self = this.set("getBlendMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColor(value: () => SkColor): Self = this.set("getColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFilterQuality(value: () => SkFilterQuality): Self = this.set("getFilterQuality", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStrokeCap(value: () => SkStrokeCap): Self = this.set("getStrokeCap", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStrokeJoin(value: () => SkStrokeJoin): Self = this.set("getStrokeJoin", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStrokeMiter(value: () => Double): Self = this.set("getStrokeMiter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStrokeWidth(value: () => Double): Self = this.set("getStrokeWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAntiAlias(value: Boolean => Unit): Self = this.set("setAntiAlias", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBlendMode(value: SkBlendMode => Unit): Self = this.set("setBlendMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetColor(value: SkColor => Unit): Self = this.set("setColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetColorFilter(value: SkColorFilter => Unit): Self = this.set("setColorFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetColorf(value: (Double, Double, Double, Double) => Unit): Self = this.set("setColorf", js.Any.fromFunction4(value))
    @scala.inline
    def setSetFilterQuality(value: SkFilterQuality => Unit): Self = this.set("setFilterQuality", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImageFilter(value: SkImageFilter => Unit): Self = this.set("setImageFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMaskFilter(value: SkMaskFilter => Unit): Self = this.set("setMaskFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPathEffect(value: SkPathEffect => Unit): Self = this.set("setPathEffect", js.Any.fromFunction1(value))
    @scala.inline
    def setSetShader(value: SkShader => Unit): Self = this.set("setShader", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStrokeCap(value: SkStrokeCap => Unit): Self = this.set("setStrokeCap", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStrokeJoin(value: SkStrokeJoin => Unit): Self = this.set("setStrokeJoin", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStrokeMiter(value: Double => Unit): Self = this.set("setStrokeMiter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStrokeWidth(value: Double => Unit): Self = this.set("setStrokeWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStyle(value: SkPaintStyle => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
  }
  
}

