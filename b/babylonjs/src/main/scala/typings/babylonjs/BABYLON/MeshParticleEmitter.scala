package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshParticleEmitter extends IParticleEmitterType {
  var _indices: js.Any
  var _normals: js.Any
  var _positions: js.Any
  var _storedNormal: js.Any
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction1: Vector3
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction2: Vector3
  /** Defines the mesh to use as source */
  var mesh: js.UndefOr[AbstractMesh] = js.undefined
  /**
    * Gets or sets a boolean indicating that particle directions must be built from mesh face normals
    */
  var useMeshNormalsForDirection: Boolean
}

object MeshParticleEmitter {
  @scala.inline
  def apply(
    _indices: js.Any,
    _normals: js.Any,
    _positions: js.Any,
    _storedNormal: js.Any,
    applyToShader: Effect => Unit,
    direction1: Vector3,
    direction2: Vector3,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: (js.Any, Scene) => Unit,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    useMeshNormalsForDirection: Boolean,
    mesh: AbstractMesh = null
  ): MeshParticleEmitter = {
    val __obj = js.Dynamic.literal(_indices = _indices.asInstanceOf[js.Any], _normals = _normals.asInstanceOf[js.Any], _positions = _positions.asInstanceOf[js.Any], _storedNormal = _storedNormal.asInstanceOf[js.Any], applyToShader = js.Any.fromFunction1(applyToShader), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction2(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction), useMeshNormalsForDirection = useMeshNormalsForDirection.asInstanceOf[js.Any])
    if (mesh != null) __obj.updateDynamic("mesh")(mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshParticleEmitter]
  }
}

