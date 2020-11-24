package typings.chromaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cubehelix extends js.Object {
  
  /**
    * gamma factor can be used to emphasise low or high intensity values, default=1
    */
  def gamma(g: Double): Cubehelix = js.native
  
  /**
    * lightness range: default: [0,1] (black -> white)
    */
  def lightness(l: js.Array[Double]): Cubehelix = js.native
  
  /**
    * number (and direction) of hue rotations (e.g. 1=360°, 1.5=`540°``), default=-1.5
    */
  def rotations(r: Double): Cubehelix = js.native
  
  /**
    * You can call cubehelix.scale() to use the cube-helix through the chroma.scale interface.
    */
  def scale(): Scale[Color] = js.native
  
  /**
    * Set start color for hue rotation, default=300
    */
  def start(s: Double): Cubehelix = js.native
}
object Cubehelix {
  
  @scala.inline
  def apply(
    gamma: Double => Cubehelix,
    lightness: js.Array[Double] => Cubehelix,
    rotations: Double => Cubehelix,
    scale: () => Scale[Color],
    start: Double => Cubehelix
  ): Cubehelix = {
    val __obj = js.Dynamic.literal(gamma = js.Any.fromFunction1(gamma), lightness = js.Any.fromFunction1(lightness), rotations = js.Any.fromFunction1(rotations), scale = js.Any.fromFunction0(scale), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[Cubehelix]
  }
  
  @scala.inline
  implicit class CubehelixOps[Self <: Cubehelix] (val x: Self) extends AnyVal {
    
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
    def setGamma(value: Double => Cubehelix): Self = this.set("gamma", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLightness(value: js.Array[Double] => Cubehelix): Self = this.set("lightness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotations(value: Double => Cubehelix): Self = this.set("rotations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScale(value: () => Scale[Color]): Self = this.set("scale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: Double => Cubehelix): Self = this.set("start", js.Any.fromFunction1(value))
  }
}
