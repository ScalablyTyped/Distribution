package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trajectory extends js.Object {
  
  var _points: js.Any = js.native
  
  val _segmentLength: js.Any = js.native
  
  /**
    * Append a new point to the Trajectory.
    * NOTE: This implementation has many allocations.
    * @param point point to append to the Trajectory
    */
  def add(point: DeepImmutable[Vector3]): Unit = js.native
  
  /**
    * Get the length of the Trajectory.
    * @returns length of the Trajectory
    */
  def getLength(): Double = js.native
  
  /**
    * Create a new Trajectory with a segment length chosen to make it
    * probable that the new Trajectory will have a specified number of
    * segments. This operation is imprecise.
    * @param targetResolution number of segments desired
    * @returns new Trajectory with approximately the requested number of segments
    */
  def resampleAtTargetResolution(targetResolution: Double): Trajectory = js.native
  
  /**
    * Serialize to JSON.
    * @returns serialized JSON string
    */
  def serialize(): String = js.native
  
  /**
    * Convert Trajectory segments into tokenized representation. This
    * representation is an array of numbers where each nth number is the
    * index of the token which is most similar to the nth segment of the
    * Trajectory.
    * @param tokens list of vectors which serve as discrete tokens
    * @returns list of indices of most similar token per segment
    */
  def tokenize(tokens: DeepImmutable[js.Array[Vector3]]): js.Array[Double] = js.native
}
object Trajectory {
  
  @scala.inline
  def apply(
    _points: js.Any,
    _segmentLength: js.Any,
    add: DeepImmutable[Vector3] => Unit,
    getLength: () => Double,
    resampleAtTargetResolution: Double => Trajectory,
    serialize: () => String,
    tokenize: DeepImmutable[js.Array[Vector3]] => js.Array[Double]
  ): Trajectory = {
    val __obj = js.Dynamic.literal(_points = _points.asInstanceOf[js.Any], _segmentLength = _segmentLength.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), getLength = js.Any.fromFunction0(getLength), resampleAtTargetResolution = js.Any.fromFunction1(resampleAtTargetResolution), serialize = js.Any.fromFunction0(serialize), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[Trajectory]
  }
  
  @scala.inline
  implicit class TrajectoryOps[Self <: Trajectory] (val x: Self) extends AnyVal {
    
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
    def set_points(value: js.Any): Self = this.set("_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_segmentLength(value: js.Any): Self = this.set("_segmentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: DeepImmutable[Vector3] => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResampleAtTargetResolution(value: Double => Trajectory): Self = this.set("resampleAtTargetResolution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: () => String): Self = this.set("serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTokenize(value: DeepImmutable[js.Array[Vector3]] => js.Array[Double]): Self = this.set("tokenize", js.Any.fromFunction1(value))
  }
}
