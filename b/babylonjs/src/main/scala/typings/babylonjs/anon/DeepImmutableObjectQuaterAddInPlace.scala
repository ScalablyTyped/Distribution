package typings.babylonjs.anon

import typings.babylonjs.BABYLON.DeepImmutable
import typings.babylonjs.BABYLON.FloatArray
import typings.babylonjs.BABYLON.Matrix
import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined babylonjs.BABYLON.DeepImmutableObject<babylonjs.BABYLON.Quaternion> */
trait DeepImmutableObjectQuaterAddInPlace extends StObject {
  
  val _isDirty: DeepImmutable[Boolean]
  
  val _w: DeepImmutable[Double]
  
  val _x: DeepImmutable[Double]
  
  val _y: DeepImmutable[Double]
  
  val _z: DeepImmutable[Double]
  
  val add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Quaternion], this.type]]
  
  val addInPlace: DeepImmutable[js.Function1[/* other */ DeepImmutable[Quaternion], this.type]]
  
  val asArray: DeepImmutable[js.Function0[js.Array[Double]]]
  
  @JSName("clone")
  val clone_FDeepImmutableObjectQuaterAddInPlace: DeepImmutable[js.Function0[this.type]]
  
  val conjugate: DeepImmutable[js.Function0[this.type]]
  
  val conjugateInPlace: DeepImmutable[js.Function0[this.type]]
  
  val conjugateToRef: DeepImmutable[js.Function1[/* ref */ Quaternion, Quaternion]]
  
  val copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[Quaternion], this.type]]
  
  val copyFromFloats: DeepImmutable[
    js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, this.type]
  ]
  
  val equalsWithEpsilon: DeepImmutable[
    js.Function2[
      /* otherQuaternion */ DeepImmutable[Quaternion], 
      /* epsilon */ js.UndefOr[Double], 
      Boolean
    ]
  ]
  
  @JSName("equals")
  val equals_FDeepImmutableObjectQuaterAddInPlace: DeepImmutable[js.Function1[/* otherQuaternion */ DeepImmutable[Quaternion], Boolean]]
  
  val fromRotationMatrix: DeepImmutable[js.Function1[/* matrix */ DeepImmutable[Matrix], this.type]]
  
  val getClassName: DeepImmutable[js.Function0[String]]
  
  val getHashCode: DeepImmutable[js.Function0[Double]]
  
  val invert: DeepImmutable[js.Function0[this.type]]
  
  val invertInPlace: DeepImmutable[js.Function0[this.type]]
  
  val length: DeepImmutable[js.Function0[Double]]
  
  val lengthSquared: DeepImmutable[js.Function0[Double]]
  
  val multiply: DeepImmutable[js.Function1[/* q1 */ DeepImmutable[Quaternion], this.type]]
  
  val multiplyInPlace: DeepImmutable[js.Function1[/* q1 */ DeepImmutable[Quaternion], this.type]]
  
  val multiplyToRef: DeepImmutable[
    js.Function2[/* q1 */ DeepImmutable[Quaternion], /* result */ Quaternion, Quaternion]
  ]
  
  val normalize: DeepImmutable[js.Function0[this.type]]
  
  val normalizeToNew: DeepImmutable[js.Function0[this.type]]
  
  val scale: DeepImmutable[js.Function1[/* value */ Double, this.type]]
  
  val scaleAndAddToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Quaternion, Quaternion]]
  
  val scaleInPlace: DeepImmutable[js.Function1[/* value */ Double, this.type]]
  
  val scaleToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Quaternion, Quaternion]]
  
  val set: DeepImmutable[
    js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, this.type]
  ]
  
  val subtract: DeepImmutable[js.Function1[/* other */ Quaternion, this.type]]
  
  val subtractInPlace: DeepImmutable[js.Function1[/* other */ DeepImmutable[Quaternion], this.type]]
  
  val toArray: DeepImmutable[js.Function2[/* array */ FloatArray, /* index */ js.UndefOr[Double], Quaternion]]
  
  val toEulerAngles: DeepImmutable[js.Function0[Vector3]]
  
  val toEulerAnglesToRef: DeepImmutable[js.Function1[/* result */ Vector3, Vector3]]
  
  val toRotationMatrix: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]
  
  @JSName("toString")
  val toString_FDeepImmutableObjectQuaterAddInPlace: DeepImmutable[js.Function0[String]]
  
  val w: DeepImmutable[js.Function0[Double]]
  
  val x: DeepImmutable[js.Function0[Double]]
  
  val y: DeepImmutable[js.Function0[Double]]
  
  val z: DeepImmutable[js.Function0[Double]]
}
object DeepImmutableObjectQuaterAddInPlace {
  
  inline def apply(
    _isDirty: DeepImmutable[Boolean],
    _w: DeepImmutable[Double],
    _x: DeepImmutable[Double],
    _y: DeepImmutable[Double],
    _z: DeepImmutable[Double],
    add: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
    ],
    addInPlace: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
    ],
    asArray: DeepImmutable[js.Function0[js.Array[Double]]],
    clone_ : DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]],
    conjugate: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]],
    conjugateInPlace: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]],
    conjugateToRef: DeepImmutable[js.Function1[/* ref */ Quaternion, Quaternion]],
    copyFrom: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
    ],
    copyFromFloats: DeepImmutable[
      js.Function4[
        /* x */ Double, 
        /* y */ Double, 
        /* z */ Double, 
        /* w */ Double, 
        DeepImmutableObjectQuaterAddInPlace
      ]
    ],
    equalsWithEpsilon: DeepImmutable[
      js.Function2[
        /* otherQuaternion */ DeepImmutable[Quaternion], 
        /* epsilon */ js.UndefOr[Double], 
        Boolean
      ]
    ],
    equals_ : DeepImmutable[js.Function1[/* otherQuaternion */ DeepImmutable[Quaternion], Boolean]],
    fromRotationMatrix: DeepImmutable[
      js.Function1[/* matrix */ DeepImmutable[Matrix], DeepImmutableObjectQuaterAddInPlace]
    ],
    getClassName: DeepImmutable[js.Function0[String]],
    getHashCode: DeepImmutable[js.Function0[Double]],
    invert: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]],
    invertInPlace: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]],
    length: DeepImmutable[js.Function0[Double]],
    lengthSquared: DeepImmutable[js.Function0[Double]],
    multiply: DeepImmutable[
      js.Function1[/* q1 */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
    ],
    multiplyInPlace: DeepImmutable[
      js.Function1[/* q1 */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
    ],
    multiplyToRef: DeepImmutable[
      js.Function2[/* q1 */ DeepImmutable[Quaternion], /* result */ Quaternion, Quaternion]
    ],
    normalize: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]],
    normalizeToNew: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]],
    scale: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuaterAddInPlace]],
    scaleAndAddToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Quaternion, Quaternion]],
    scaleInPlace: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuaterAddInPlace]],
    scaleToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Quaternion, Quaternion]],
    set: DeepImmutable[
      js.Function4[
        /* x */ Double, 
        /* y */ Double, 
        /* z */ Double, 
        /* w */ Double, 
        DeepImmutableObjectQuaterAddInPlace
      ]
    ],
    subtract: DeepImmutable[js.Function1[/* other */ Quaternion, DeepImmutableObjectQuaterAddInPlace]],
    subtractInPlace: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
    ],
    toArray: DeepImmutable[js.Function2[/* array */ FloatArray, /* index */ js.UndefOr[Double], Quaternion]],
    toEulerAngles: DeepImmutable[js.Function0[Vector3]],
    toEulerAnglesToRef: DeepImmutable[js.Function1[/* result */ Vector3, Vector3]],
    toRotationMatrix: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]],
    toString_ : DeepImmutable[js.Function0[String]],
    w: DeepImmutable[js.Function0[Double]],
    x: DeepImmutable[js.Function0[Double]],
    y: DeepImmutable[js.Function0[Double]],
    z: DeepImmutable[js.Function0[Double]]
  ): DeepImmutableObjectQuaterAddInPlace = {
    val __obj = js.Dynamic.literal(_isDirty = _isDirty.asInstanceOf[js.Any], _w = _w.asInstanceOf[js.Any], _x = _x.asInstanceOf[js.Any], _y = _y.asInstanceOf[js.Any], _z = _z.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], addInPlace = addInPlace.asInstanceOf[js.Any], asArray = asArray.asInstanceOf[js.Any], conjugate = conjugate.asInstanceOf[js.Any], conjugateInPlace = conjugateInPlace.asInstanceOf[js.Any], conjugateToRef = conjugateToRef.asInstanceOf[js.Any], copyFrom = copyFrom.asInstanceOf[js.Any], copyFromFloats = copyFromFloats.asInstanceOf[js.Any], equalsWithEpsilon = equalsWithEpsilon.asInstanceOf[js.Any], fromRotationMatrix = fromRotationMatrix.asInstanceOf[js.Any], getClassName = getClassName.asInstanceOf[js.Any], getHashCode = getHashCode.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], invertInPlace = invertInPlace.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lengthSquared = lengthSquared.asInstanceOf[js.Any], multiply = multiply.asInstanceOf[js.Any], multiplyInPlace = multiplyInPlace.asInstanceOf[js.Any], multiplyToRef = multiplyToRef.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], normalizeToNew = normalizeToNew.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleAndAddToRef = scaleAndAddToRef.asInstanceOf[js.Any], scaleInPlace = scaleInPlace.asInstanceOf[js.Any], scaleToRef = scaleToRef.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], subtract = subtract.asInstanceOf[js.Any], subtractInPlace = subtractInPlace.asInstanceOf[js.Any], toArray = toArray.asInstanceOf[js.Any], toEulerAngles = toEulerAngles.asInstanceOf[js.Any], toEulerAnglesToRef = toEulerAnglesToRef.asInstanceOf[js.Any], toRotationMatrix = toRotationMatrix.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepImmutableObjectQuaterAddInPlace]
  }
  
  extension [Self <: DeepImmutableObjectQuaterAddInPlace](x: Self) {
    
    inline def setAdd(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
        ]
    ): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddInPlace(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
        ]
    ): Self = StObject.set(x, "addInPlace", value.asInstanceOf[js.Any])
    
    inline def setAsArray(value: DeepImmutable[js.Function0[js.Array[Double]]]): Self = StObject.set(x, "asArray", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setConjugate(value: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "conjugate", value.asInstanceOf[js.Any])
    
    inline def setConjugateInPlace(value: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "conjugateInPlace", value.asInstanceOf[js.Any])
    
    inline def setConjugateToRef(value: DeepImmutable[js.Function1[/* ref */ Quaternion, Quaternion]]): Self = StObject.set(x, "conjugateToRef", value.asInstanceOf[js.Any])
    
    inline def setCopyFrom(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
        ]
    ): Self = StObject.set(x, "copyFrom", value.asInstanceOf[js.Any])
    
    inline def setCopyFromFloats(
      value: DeepImmutable[
          js.Function4[
            /* x */ Double, 
            /* y */ Double, 
            /* z */ Double, 
            /* w */ Double, 
            DeepImmutableObjectQuaterAddInPlace
          ]
        ]
    ): Self = StObject.set(x, "copyFromFloats", value.asInstanceOf[js.Any])
    
    inline def setEqualsWithEpsilon(
      value: DeepImmutable[
          js.Function2[
            /* otherQuaternion */ DeepImmutable[Quaternion], 
            /* epsilon */ js.UndefOr[Double], 
            Boolean
          ]
        ]
    ): Self = StObject.set(x, "equalsWithEpsilon", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: DeepImmutable[js.Function1[/* otherQuaternion */ DeepImmutable[Quaternion], Boolean]]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setFromRotationMatrix(
      value: DeepImmutable[
          js.Function1[/* matrix */ DeepImmutable[Matrix], DeepImmutableObjectQuaterAddInPlace]
        ]
    ): Self = StObject.set(x, "fromRotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setGetClassName(value: DeepImmutable[js.Function0[String]]): Self = StObject.set(x, "getClassName", value.asInstanceOf[js.Any])
    
    inline def setGetHashCode(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "getHashCode", value.asInstanceOf[js.Any])
    
    inline def setInvert(value: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertInPlace(value: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "invertInPlace", value.asInstanceOf[js.Any])
    
    inline def setLength(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthSquared(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "lengthSquared", value.asInstanceOf[js.Any])
    
    inline def setMultiply(
      value: DeepImmutable[
          js.Function1[/* q1 */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
        ]
    ): Self = StObject.set(x, "multiply", value.asInstanceOf[js.Any])
    
    inline def setMultiplyInPlace(
      value: DeepImmutable[
          js.Function1[/* q1 */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
        ]
    ): Self = StObject.set(x, "multiplyInPlace", value.asInstanceOf[js.Any])
    
    inline def setMultiplyToRef(
      value: DeepImmutable[
          js.Function2[/* q1 */ DeepImmutable[Quaternion], /* result */ Quaternion, Quaternion]
        ]
    ): Self = StObject.set(x, "multiplyToRef", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeToNew(value: DeepImmutable[js.Function0[DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "normalizeToNew", value.asInstanceOf[js.Any])
    
    inline def setScale(value: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleAndAddToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Quaternion, Quaternion]]): Self = StObject.set(x, "scaleAndAddToRef", value.asInstanceOf[js.Any])
    
    inline def setScaleInPlace(value: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "scaleInPlace", value.asInstanceOf[js.Any])
    
    inline def setScaleToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Quaternion, Quaternion]]): Self = StObject.set(x, "scaleToRef", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: DeepImmutable[
          js.Function4[
            /* x */ Double, 
            /* y */ Double, 
            /* z */ Double, 
            /* w */ Double, 
            DeepImmutableObjectQuaterAddInPlace
          ]
        ]
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSubtract(value: DeepImmutable[js.Function1[/* other */ Quaternion, DeepImmutableObjectQuaterAddInPlace]]): Self = StObject.set(x, "subtract", value.asInstanceOf[js.Any])
    
    inline def setSubtractInPlace(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[Quaternion], DeepImmutableObjectQuaterAddInPlace]
        ]
    ): Self = StObject.set(x, "subtractInPlace", value.asInstanceOf[js.Any])
    
    inline def setToArray(
      value: DeepImmutable[js.Function2[/* array */ FloatArray, /* index */ js.UndefOr[Double], Quaternion]]
    ): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
    
    inline def setToEulerAngles(value: DeepImmutable[js.Function0[Vector3]]): Self = StObject.set(x, "toEulerAngles", value.asInstanceOf[js.Any])
    
    inline def setToEulerAnglesToRef(value: DeepImmutable[js.Function1[/* result */ Vector3, Vector3]]): Self = StObject.set(x, "toEulerAnglesToRef", value.asInstanceOf[js.Any])
    
    inline def setToRotationMatrix(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = StObject.set(x, "toRotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setToString_(value: DeepImmutable[js.Function0[String]]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
    
    inline def setW(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def set_isDirty(value: DeepImmutable[Boolean]): Self = StObject.set(x, "_isDirty", value.asInstanceOf[js.Any])
    
    inline def set_w(value: DeepImmutable[Double]): Self = StObject.set(x, "_w", value.asInstanceOf[js.Any])
    
    inline def set_x(value: DeepImmutable[Double]): Self = StObject.set(x, "_x", value.asInstanceOf[js.Any])
    
    inline def set_y(value: DeepImmutable[Double]): Self = StObject.set(x, "_y", value.asInstanceOf[js.Any])
    
    inline def set_z(value: DeepImmutable[Double]): Self = StObject.set(x, "_z", value.asInstanceOf[js.Any])
  }
}
