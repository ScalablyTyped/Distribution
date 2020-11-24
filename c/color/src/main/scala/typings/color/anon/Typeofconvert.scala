package typings.color.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofconvert extends js.Object {
  
  val ansi16: readonlychannels1readonlyAnsi256 = js.native
  
  val ansi256: readonlychannels1readonly = js.native
  
  val apple: readonlychannels3readonlyGray = js.native
  
  val cmyk: readonlychannels4readonly = js.native
  
  val gray: readonlychannels1readonlyChannels = js.native
  
  val hcg: readonlychannels3readonlyAnsi256 = js.native
  
  val hex: readonlychannels1readonlyAnsi16 = js.native
  
  val hsl: readonlychannels3readonlyChannels = js.native
  
  val hsv: readonlychannels3readonlyCmyk = js.native
  
  val hwb: readonlychannels3readonlyHcg = js.native
  
  val keyword: readonlychannels1readonlyApple = js.native
  
  val lab: readonlychannels3readonlyHex = js.native
  
  val lch: readonlychannels3readonlyApple = js.native
  
  val rgb: readonlychannels3readonly = js.native
  
  val xyz: readonlychannels3readonlyAnsi16 = js.native
}
object Typeofconvert {
  
  @scala.inline
  def apply(
    ansi16: readonlychannels1readonlyAnsi256,
    ansi256: readonlychannels1readonly,
    apple: readonlychannels3readonlyGray,
    cmyk: readonlychannels4readonly,
    gray: readonlychannels1readonlyChannels,
    hcg: readonlychannels3readonlyAnsi256,
    hex: readonlychannels1readonlyAnsi16,
    hsl: readonlychannels3readonlyChannels,
    hsv: readonlychannels3readonlyCmyk,
    hwb: readonlychannels3readonlyHcg,
    keyword: readonlychannels1readonlyApple,
    lab: readonlychannels3readonlyHex,
    lch: readonlychannels3readonlyApple,
    rgb: readonlychannels3readonly,
    xyz: readonlychannels3readonlyAnsi16
  ): Typeofconvert = {
    val __obj = js.Dynamic.literal(ansi16 = ansi16.asInstanceOf[js.Any], ansi256 = ansi256.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], cmyk = cmyk.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], hcg = hcg.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], hwb = hwb.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], lch = lch.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], xyz = xyz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofconvert]
  }
  
  @scala.inline
  implicit class TypeofconvertOps[Self <: Typeofconvert] (val x: Self) extends AnyVal {
    
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
    def setAnsi16(value: readonlychannels1readonlyAnsi256): Self = this.set("ansi16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnsi256(value: readonlychannels1readonly): Self = this.set("ansi256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApple(value: readonlychannels3readonlyGray): Self = this.set("apple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmyk(value: readonlychannels4readonly): Self = this.set("cmyk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGray(value: readonlychannels1readonlyChannels): Self = this.set("gray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHcg(value: readonlychannels3readonlyAnsi256): Self = this.set("hcg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: readonlychannels1readonlyAnsi16): Self = this.set("hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsl(value: readonlychannels3readonlyChannels): Self = this.set("hsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsv(value: readonlychannels3readonlyCmyk): Self = this.set("hsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHwb(value: readonlychannels3readonlyHcg): Self = this.set("hwb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyword(value: readonlychannels1readonlyApple): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLab(value: readonlychannels3readonlyHex): Self = this.set("lab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLch(value: readonlychannels3readonlyApple): Self = this.set("lch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgb(value: readonlychannels3readonly): Self = this.set("rgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXyz(value: readonlychannels3readonlyAnsi16): Self = this.set("xyz", value.asInstanceOf[js.Any])
  }
}
