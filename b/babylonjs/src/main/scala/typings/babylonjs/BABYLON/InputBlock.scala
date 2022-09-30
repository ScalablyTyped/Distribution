package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _animationType: Any = js.native
  
  /* private */ var _associatedVariableName: Any = js.native
  
  /* private */ var _emit: Any = js.native
  
  /* private */ var _emitConstant: Any = js.native
  
  /* private */ var _emitDefine: Any = js.native
  
  /* private */ var _mode: Any = js.native
  
  /** @internal */
  def _noContextSwitch: Boolean = js.native
  
  /* private */ var _storedValue: Any = js.native
  
  /** @internal */
  var _systemValue: Nullable[NodeMaterialSystemValues] = js.native
  
  /**
    * @internal
    */
  def _transmit(effect: Effect, scene: Scene, material: NodeMaterial): Unit = js.native
  
  /**
    * @internal
    */
  def _transmitWorld(effect: Effect, world: Matrix, worldView: Matrix, worldViewProjection: Matrix): Unit = js.native
  
  /* private */ var _type: Any = js.native
  
  /* private */ var _valueCallback: Any = js.native
  
  /**
    * Animate the input if animationType !== None
    * @param scene defines the rendering scene
    */
  def animate(scene: Scene): Unit = js.native
  
  /** Gets or sets the type of animation applied to the input */
  def animationType: AnimatedInputBlockTypes = js.native
  def animationType_=(value: AnimatedInputBlockTypes): Unit = js.native
  
  /**
    * Gets or sets the associated variable name in the shader
    */
  def associatedVariableName: String = js.native
  def associatedVariableName_=(value: String): Unit = js.native
  
  /** Gets or sets a boolean indicating if content needs to be converted to gamma space (for color3/4 only) */
  var convertToGammaSpace: Boolean = js.native
  
  /** Gets or sets a boolean indicating if content needs to be converted to linear space (for color3/4 only) */
  var convertToLinearSpace: Boolean = js.native
  
  /** Gets or sets the group to use to display this block in the Inspector */
  var groupInInspector: String = js.native
  
  def initialize(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that this connection point is coming from an attribute.
    * In this case the connection point name must be the name of the attribute to use
    * Can only be set on inputs
    */
  def isAttribute: Boolean = js.native
  def isAttribute_=(value: Boolean): Unit = js.native
  
  /** Gets or set a value indicating that this input can only get 0 and 1 values */
  var isBoolean: Boolean = js.native
  
  /** Gets or sets a boolean indicating that the value of this input will not change after a build */
  var isConstant: Boolean = js.native
  
  /**
    * Gets a boolean indicating that the current connection point is a system value
    */
  def isSystemValue: Boolean = js.native
  
  /**
    * Gets a boolean indicating that this connection point not defined yet
    */
  def isUndefined: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating that this connection point is coming from an uniform.
    * In this case the connection point name must be the name of the uniform to use.
    * Can only be set on inputs
    */
  def isUniform: Boolean = js.native
  def isUniform_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that this connection point is generating a varying variable.
    * Can only be set on exit points
    */
  def isVarying: Boolean = js.native
  def isVarying_=(value: Boolean): Unit = js.native
  
  /** Gets or sets a value used by the Node Material editor to determine how to configure the current value if it is a matrix */
  var matrixMode: Double = js.native
  
  /** Gets or set a value used to limit the range of float values */
  var max: Double = js.native
  
  /** Gets or set a value used to limit the range of float values */
  var min: Double = js.native
  
  /** Gets an observable raised when the value is changed */
  var onValueChangedObservable: Observable[InputBlock] = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Set the source of this connection point to a vertex attribute
    * @param attributeName defines the attribute name (position, uv, normal, etc...). If not specified it will take the connection point name
    * @returns the current connection point
    */
  def setAsAttribute(): InputBlock = js.native
  def setAsAttribute(attributeName: String): InputBlock = js.native
  
  /**
    * Set the source of this connection point to a system value
    * @param value define the system value to use (world, view, etc...) or null to switch to manual value
    * @returns the current connection point
    */
  def setAsSystemValue(value: Nullable[NodeMaterialSystemValues]): InputBlock = js.native
  
  /**
    * Set the input block to its default value (based on its type)
    */
  def setDefaultValue(): Unit = js.native
  
  /**
    * Gets or sets the current well known value or null if not defined as a system value
    */
  def systemValue: Nullable[NodeMaterialSystemValues] = js.native
  def systemValue_=(value: Nullable[NodeMaterialSystemValues]): Unit = js.native
  
  /**
    * Gets or sets the connection point type (default is float)
    */
  def `type`: NodeMaterialBlockConnectionPointTypes = js.native
  
  /**
    * Gets or sets the value of that point.
    * Please note that this value will be ignored if valueCallback is defined
    */
  def value: Any = js.native
  
  /**
    * Gets or sets a callback used to get the value of that point.
    * Please note that setting this value will force the connection point to ignore the value property
    */
  def valueCallback: js.Function0[Any] = js.native
  def valueCallback_=(value: js.Function0[Any]): Unit = js.native
  
  def value_=(value: Any): Unit = js.native
}
