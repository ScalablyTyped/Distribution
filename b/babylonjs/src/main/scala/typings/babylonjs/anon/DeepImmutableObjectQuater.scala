package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.typesMod.DeepImmutable
import typings.babylonjs.typesMod.FloatArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined babylonjs.babylonjs/types.DeepImmutableObject<babylonjs.babylonjs/Maths/math.vector.Quaternion> */
trait DeepImmutableObjectQuater extends StObject {
  
  val AreClose: DeepImmutable[js.UndefOr[Any]]
  
  val Dot: DeepImmutable[js.UndefOr[Any]]
  
  val FromArray: DeepImmutable[js.UndefOr[Any]]
  
  val FromArrayToRef: DeepImmutable[js.UndefOr[Any]]
  
  val FromEulerAngles: DeepImmutable[js.UndefOr[Any]]
  
  val FromEulerAnglesToRef: DeepImmutable[js.UndefOr[Any]]
  
  val FromEulerVector: DeepImmutable[js.UndefOr[Any]]
  
  val FromEulerVectorToRef: DeepImmutable[js.UndefOr[Any]]
  
  val FromLookDirectionLH: DeepImmutable[js.UndefOr[Any]]
  
  val FromLookDirectionLHToRef: DeepImmutable[js.UndefOr[Any]]
  
  val FromLookDirectionRH: DeepImmutable[js.UndefOr[Any]]
  
  val FromLookDirectionRHToRef: DeepImmutable[js.UndefOr[Any]]
  
  val FromRotationMatrix: DeepImmutable[js.UndefOr[Any]]
  
  val FromRotationMatrixToRef: DeepImmutable[js.UndefOr[Any]]
  
  val FromUnitVectorsToRef: DeepImmutable[js.UndefOr[Any]]
  
  val Hermite: DeepImmutable[js.UndefOr[Any]]
  
  val Hermite1stDerivative: DeepImmutable[js.UndefOr[Any]]
  
  val Hermite1stDerivativeToRef: DeepImmutable[js.UndefOr[Any]]
  
  val Identity: DeepImmutable[js.UndefOr[Any]]
  
  val Inverse: DeepImmutable[js.UndefOr[Any]]
  
  val InverseToRef: DeepImmutable[js.UndefOr[Any]]
  
  val IsIdentity: DeepImmutable[js.UndefOr[Any]]
  
  val RotationAlphaBetaGamma: DeepImmutable[js.UndefOr[Any]]
  
  val RotationAlphaBetaGammaToRef: DeepImmutable[js.UndefOr[Any]]
  
  val RotationAxis: DeepImmutable[js.UndefOr[Any]]
  
  val RotationAxisToRef: DeepImmutable[js.UndefOr[Any]]
  
  val RotationQuaternionFromAxis: DeepImmutable[js.UndefOr[Any]]
  
  val RotationQuaternionFromAxisToRef: DeepImmutable[js.UndefOr[Any]]
  
  val RotationQuaternionFromOnto: DeepImmutable[js.UndefOr[Any]]
  
  val RotationQuaternionFromOntoToRef: DeepImmutable[js.UndefOr[Any]]
  
  val RotationYawPitchRoll: DeepImmutable[js.UndefOr[Any]]
  
  val RotationYawPitchRollToRef: DeepImmutable[js.UndefOr[Any]]
  
  val Slerp: DeepImmutable[js.UndefOr[Any]]
  
  val SlerpToRef: DeepImmutable[js.UndefOr[Any]]
  
  val SmoothToRef: DeepImmutable[js.UndefOr[Any]]
  
  val Zero: DeepImmutable[js.UndefOr[Any]]
  
  val _isDirty: DeepImmutable[Boolean]
  
  val _w: DeepImmutable[Double]
  
  val _x: DeepImmutable[Double]
  
  val _y: DeepImmutable[Double]
  
  val _z: DeepImmutable[Double]
  
  val add: DeepImmutable[js.Function1[/* other */ DeepImmutable[this.type], this.type]]
  
  val addInPlace: DeepImmutable[js.Function1[/* other */ DeepImmutable[this.type], this.type]]
  
  val asArray: DeepImmutable[js.Function0[js.Array[Double]]]
  
  @JSName("clone")
  val clone_FDeepImmutableObjectQuater: DeepImmutable[js.Function0[this.type]]
  
  val conjugate: DeepImmutable[js.Function0[this.type]]
  
  val conjugateInPlace: DeepImmutable[js.Function0[this.type]]
  
  val conjugateToRef: DeepImmutable[js.Function1[/* ref */ this.type, this.type]]
  
  val constructor: DeepImmutable[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* z */ js.UndefOr[Double], 
      /* w */ js.UndefOr[Double], 
      Any
    ]
  ]
  
  val copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[this.type], this.type]]
  
  val copyFromFloats: DeepImmutable[
    js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, this.type]
  ]
  
  val equalsWithEpsilon: DeepImmutable[
    js.Function2[
      /* otherQuaternion */ DeepImmutable[this.type], 
      /* epsilon */ js.UndefOr[Double], 
      Boolean
    ]
  ]
  
  @JSName("equals")
  val equals_FDeepImmutableObjectQuater: DeepImmutable[js.Function1[/* otherQuaternion */ DeepImmutable[this.type], Boolean]]
  
  val fromRotationMatrix: DeepImmutable[js.Function1[/* matrix */ DeepImmutable[Matrix], this.type]]
  
  val getClassName: DeepImmutable[js.Function0[String]]
  
  val getHashCode: DeepImmutable[js.Function0[Double]]
  
  val invert: DeepImmutable[js.Function0[this.type]]
  
  val invertInPlace: DeepImmutable[js.Function0[this.type]]
  
  val length: DeepImmutable[js.Function0[Double]]
  
  val lengthSquared: DeepImmutable[js.Function0[Double]]
  
  val multiply: DeepImmutable[js.Function1[/* q1 */ DeepImmutable[this.type], this.type]]
  
  val multiplyInPlace: DeepImmutable[js.Function1[/* q1 */ DeepImmutable[this.type], this.type]]
  
  val multiplyToRef: DeepImmutable[
    js.Function2[/* q1 */ DeepImmutable[this.type], /* result */ this.type, this.type]
  ]
  
  val normalize: DeepImmutable[js.Function0[this.type]]
  
  val normalizeToNew: DeepImmutable[js.Function0[this.type]]
  
  val scale: DeepImmutable[js.Function1[/* value */ Double, this.type]]
  
  val scaleAndAddToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ this.type, this.type]]
  
  val scaleInPlace: DeepImmutable[js.Function1[/* value */ Double, this.type]]
  
  val scaleToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ this.type, this.type]]
  
  val set: DeepImmutable[
    js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, this.type]
  ]
  
  val subtract: DeepImmutable[js.Function1[/* other */ this.type, this.type]]
  
  val subtractInPlace: DeepImmutable[js.Function1[/* other */ DeepImmutable[this.type], this.type]]
  
  val toArray: DeepImmutable[js.Function2[/* array */ FloatArray, /* index */ js.UndefOr[Double], this.type]]
  
  val toEulerAngles: DeepImmutable[js.Function0[Vector3]]
  
  val toEulerAnglesToRef: DeepImmutable[js.Function1[/* result */ Vector3, Vector3]]
  
  val toRotationMatrix: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]
  
  @JSName("toString")
  val toString_FDeepImmutableObjectQuater: DeepImmutable[js.Function0[String]]
  
  val w: DeepImmutable[js.Function0[Double]]
  
  val x: DeepImmutable[js.Function0[Double]]
  
  val y: DeepImmutable[js.Function0[Double]]
  
  val z: DeepImmutable[js.Function0[Double]]
}
object DeepImmutableObjectQuater {
  
  inline def apply(
    AreClose: DeepImmutable[js.UndefOr[Any]],
    Dot: DeepImmutable[js.UndefOr[Any]],
    FromArray: DeepImmutable[js.UndefOr[Any]],
    FromArrayToRef: DeepImmutable[js.UndefOr[Any]],
    FromEulerAngles: DeepImmutable[js.UndefOr[Any]],
    FromEulerAnglesToRef: DeepImmutable[js.UndefOr[Any]],
    FromEulerVector: DeepImmutable[js.UndefOr[Any]],
    FromEulerVectorToRef: DeepImmutable[js.UndefOr[Any]],
    FromLookDirectionLH: DeepImmutable[js.UndefOr[Any]],
    FromLookDirectionLHToRef: DeepImmutable[js.UndefOr[Any]],
    FromLookDirectionRH: DeepImmutable[js.UndefOr[Any]],
    FromLookDirectionRHToRef: DeepImmutable[js.UndefOr[Any]],
    FromRotationMatrix: DeepImmutable[js.UndefOr[Any]],
    FromRotationMatrixToRef: DeepImmutable[js.UndefOr[Any]],
    FromUnitVectorsToRef: DeepImmutable[js.UndefOr[Any]],
    Hermite: DeepImmutable[js.UndefOr[Any]],
    Hermite1stDerivative: DeepImmutable[js.UndefOr[Any]],
    Hermite1stDerivativeToRef: DeepImmutable[js.UndefOr[Any]],
    Identity: DeepImmutable[js.UndefOr[Any]],
    Inverse: DeepImmutable[js.UndefOr[Any]],
    InverseToRef: DeepImmutable[js.UndefOr[Any]],
    IsIdentity: DeepImmutable[js.UndefOr[Any]],
    RotationAlphaBetaGamma: DeepImmutable[js.UndefOr[Any]],
    RotationAlphaBetaGammaToRef: DeepImmutable[js.UndefOr[Any]],
    RotationAxis: DeepImmutable[js.UndefOr[Any]],
    RotationAxisToRef: DeepImmutable[js.UndefOr[Any]],
    RotationQuaternionFromAxis: DeepImmutable[js.UndefOr[Any]],
    RotationQuaternionFromAxisToRef: DeepImmutable[js.UndefOr[Any]],
    RotationQuaternionFromOnto: DeepImmutable[js.UndefOr[Any]],
    RotationQuaternionFromOntoToRef: DeepImmutable[js.UndefOr[Any]],
    RotationYawPitchRoll: DeepImmutable[js.UndefOr[Any]],
    RotationYawPitchRollToRef: DeepImmutable[js.UndefOr[Any]],
    Slerp: DeepImmutable[js.UndefOr[Any]],
    SlerpToRef: DeepImmutable[js.UndefOr[Any]],
    SmoothToRef: DeepImmutable[js.UndefOr[Any]],
    Zero: DeepImmutable[js.UndefOr[Any]],
    _isDirty: DeepImmutable[Boolean],
    _w: DeepImmutable[Double],
    _x: DeepImmutable[Double],
    _y: DeepImmutable[Double],
    _z: DeepImmutable[Double],
    add: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
    ],
    addInPlace: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
    ],
    asArray: DeepImmutable[js.Function0[js.Array[Double]]],
    clone_ : DeepImmutable[js.Function0[DeepImmutableObjectQuater]],
    conjugate: DeepImmutable[js.Function0[DeepImmutableObjectQuater]],
    conjugateInPlace: DeepImmutable[js.Function0[DeepImmutableObjectQuater]],
    conjugateToRef: DeepImmutable[js.Function1[DeepImmutableObjectQuater, DeepImmutableObjectQuater]],
    constructor: DeepImmutable[
      js.Function4[
        /* x */ js.UndefOr[Double], 
        /* y */ js.UndefOr[Double], 
        /* z */ js.UndefOr[Double], 
        /* w */ js.UndefOr[Double], 
        Any
      ]
    ],
    copyFrom: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
    ],
    copyFromFloats: DeepImmutable[
      js.Function4[
        /* x */ Double, 
        /* y */ Double, 
        /* z */ Double, 
        /* w */ Double, 
        DeepImmutableObjectQuater
      ]
    ],
    equalsWithEpsilon: DeepImmutable[
      js.Function2[
        /* otherQuaternion */ DeepImmutable[DeepImmutableObjectQuater], 
        /* epsilon */ js.UndefOr[Double], 
        Boolean
      ]
    ],
    equals_ : DeepImmutable[
      js.Function1[/* otherQuaternion */ DeepImmutable[DeepImmutableObjectQuater], Boolean]
    ],
    fromRotationMatrix: DeepImmutable[js.Function1[/* matrix */ DeepImmutable[Matrix], DeepImmutableObjectQuater]],
    getClassName: DeepImmutable[js.Function0[String]],
    getHashCode: DeepImmutable[js.Function0[Double]],
    invert: DeepImmutable[js.Function0[DeepImmutableObjectQuater]],
    invertInPlace: DeepImmutable[js.Function0[DeepImmutableObjectQuater]],
    length: DeepImmutable[js.Function0[Double]],
    lengthSquared: DeepImmutable[js.Function0[Double]],
    multiply: DeepImmutable[
      js.Function1[/* q1 */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
    ],
    multiplyInPlace: DeepImmutable[
      js.Function1[/* q1 */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
    ],
    multiplyToRef: DeepImmutable[
      js.Function2[
        /* q1 */ DeepImmutable[DeepImmutableObjectQuater], 
        DeepImmutableObjectQuater, 
        DeepImmutableObjectQuater
      ]
    ],
    normalize: DeepImmutable[js.Function0[DeepImmutableObjectQuater]],
    normalizeToNew: DeepImmutable[js.Function0[DeepImmutableObjectQuater]],
    scale: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuater]],
    scaleAndAddToRef: DeepImmutable[
      js.Function2[/* scale */ Double, DeepImmutableObjectQuater, DeepImmutableObjectQuater]
    ],
    scaleInPlace: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuater]],
    scaleToRef: DeepImmutable[
      js.Function2[/* scale */ Double, DeepImmutableObjectQuater, DeepImmutableObjectQuater]
    ],
    set: DeepImmutable[
      js.Function4[
        /* x */ Double, 
        /* y */ Double, 
        /* z */ Double, 
        /* w */ Double, 
        DeepImmutableObjectQuater
      ]
    ],
    subtract: DeepImmutable[js.Function1[DeepImmutableObjectQuater, DeepImmutableObjectQuater]],
    subtractInPlace: DeepImmutable[
      js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
    ],
    toArray: DeepImmutable[
      js.Function2[/* array */ FloatArray, /* index */ js.UndefOr[Double], DeepImmutableObjectQuater]
    ],
    toEulerAngles: DeepImmutable[js.Function0[Vector3]],
    toEulerAnglesToRef: DeepImmutable[js.Function1[/* result */ Vector3, Vector3]],
    toRotationMatrix: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]],
    toString_ : DeepImmutable[js.Function0[String]],
    w: DeepImmutable[js.Function0[Double]],
    x: DeepImmutable[js.Function0[Double]],
    y: DeepImmutable[js.Function0[Double]],
    z: DeepImmutable[js.Function0[Double]]
  ): DeepImmutableObjectQuater = {
    val __obj = js.Dynamic.literal(AreClose = AreClose.asInstanceOf[js.Any], Dot = Dot.asInstanceOf[js.Any], FromArray = FromArray.asInstanceOf[js.Any], FromArrayToRef = FromArrayToRef.asInstanceOf[js.Any], FromEulerAngles = FromEulerAngles.asInstanceOf[js.Any], FromEulerAnglesToRef = FromEulerAnglesToRef.asInstanceOf[js.Any], FromEulerVector = FromEulerVector.asInstanceOf[js.Any], FromEulerVectorToRef = FromEulerVectorToRef.asInstanceOf[js.Any], FromLookDirectionLH = FromLookDirectionLH.asInstanceOf[js.Any], FromLookDirectionLHToRef = FromLookDirectionLHToRef.asInstanceOf[js.Any], FromLookDirectionRH = FromLookDirectionRH.asInstanceOf[js.Any], FromLookDirectionRHToRef = FromLookDirectionRHToRef.asInstanceOf[js.Any], FromRotationMatrix = FromRotationMatrix.asInstanceOf[js.Any], FromRotationMatrixToRef = FromRotationMatrixToRef.asInstanceOf[js.Any], FromUnitVectorsToRef = FromUnitVectorsToRef.asInstanceOf[js.Any], Hermite = Hermite.asInstanceOf[js.Any], Hermite1stDerivative = Hermite1stDerivative.asInstanceOf[js.Any], Hermite1stDerivativeToRef = Hermite1stDerivativeToRef.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any], Inverse = Inverse.asInstanceOf[js.Any], InverseToRef = InverseToRef.asInstanceOf[js.Any], IsIdentity = IsIdentity.asInstanceOf[js.Any], RotationAlphaBetaGamma = RotationAlphaBetaGamma.asInstanceOf[js.Any], RotationAlphaBetaGammaToRef = RotationAlphaBetaGammaToRef.asInstanceOf[js.Any], RotationAxis = RotationAxis.asInstanceOf[js.Any], RotationAxisToRef = RotationAxisToRef.asInstanceOf[js.Any], RotationQuaternionFromAxis = RotationQuaternionFromAxis.asInstanceOf[js.Any], RotationQuaternionFromAxisToRef = RotationQuaternionFromAxisToRef.asInstanceOf[js.Any], RotationQuaternionFromOnto = RotationQuaternionFromOnto.asInstanceOf[js.Any], RotationQuaternionFromOntoToRef = RotationQuaternionFromOntoToRef.asInstanceOf[js.Any], RotationYawPitchRoll = RotationYawPitchRoll.asInstanceOf[js.Any], RotationYawPitchRollToRef = RotationYawPitchRollToRef.asInstanceOf[js.Any], Slerp = Slerp.asInstanceOf[js.Any], SlerpToRef = SlerpToRef.asInstanceOf[js.Any], SmoothToRef = SmoothToRef.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any], _isDirty = _isDirty.asInstanceOf[js.Any], _w = _w.asInstanceOf[js.Any], _x = _x.asInstanceOf[js.Any], _y = _y.asInstanceOf[js.Any], _z = _z.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], addInPlace = addInPlace.asInstanceOf[js.Any], asArray = asArray.asInstanceOf[js.Any], conjugate = conjugate.asInstanceOf[js.Any], conjugateInPlace = conjugateInPlace.asInstanceOf[js.Any], conjugateToRef = conjugateToRef.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], copyFrom = copyFrom.asInstanceOf[js.Any], copyFromFloats = copyFromFloats.asInstanceOf[js.Any], equalsWithEpsilon = equalsWithEpsilon.asInstanceOf[js.Any], fromRotationMatrix = fromRotationMatrix.asInstanceOf[js.Any], getClassName = getClassName.asInstanceOf[js.Any], getHashCode = getHashCode.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], invertInPlace = invertInPlace.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lengthSquared = lengthSquared.asInstanceOf[js.Any], multiply = multiply.asInstanceOf[js.Any], multiplyInPlace = multiplyInPlace.asInstanceOf[js.Any], multiplyToRef = multiplyToRef.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], normalizeToNew = normalizeToNew.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleAndAddToRef = scaleAndAddToRef.asInstanceOf[js.Any], scaleInPlace = scaleInPlace.asInstanceOf[js.Any], scaleToRef = scaleToRef.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], subtract = subtract.asInstanceOf[js.Any], subtractInPlace = subtractInPlace.asInstanceOf[js.Any], toArray = toArray.asInstanceOf[js.Any], toEulerAngles = toEulerAngles.asInstanceOf[js.Any], toEulerAnglesToRef = toEulerAnglesToRef.asInstanceOf[js.Any], toRotationMatrix = toRotationMatrix.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepImmutableObjectQuater]
  }
  
  extension [Self <: DeepImmutableObjectQuater](x: Self) {
    
    inline def setAdd(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddInPlace(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "addInPlace", value.asInstanceOf[js.Any])
    
    inline def setAreClose(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "AreClose", value.asInstanceOf[js.Any])
    
    inline def setAsArray(value: DeepImmutable[js.Function0[js.Array[Double]]]): Self = StObject.set(x, "asArray", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: DeepImmutable[js.Function0[DeepImmutableObjectQuater]]): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setConjugate(value: DeepImmutable[js.Function0[DeepImmutableObjectQuater]]): Self = StObject.set(x, "conjugate", value.asInstanceOf[js.Any])
    
    inline def setConjugateInPlace(value: DeepImmutable[js.Function0[DeepImmutableObjectQuater]]): Self = StObject.set(x, "conjugateInPlace", value.asInstanceOf[js.Any])
    
    inline def setConjugateToRef(value: DeepImmutable[js.Function1[DeepImmutableObjectQuater, DeepImmutableObjectQuater]]): Self = StObject.set(x, "conjugateToRef", value.asInstanceOf[js.Any])
    
    inline def setConstructor(
      value: DeepImmutable[
          js.Function4[
            /* x */ js.UndefOr[Double], 
            /* y */ js.UndefOr[Double], 
            /* z */ js.UndefOr[Double], 
            /* w */ js.UndefOr[Double], 
            Any
          ]
        ]
    ): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setCopyFrom(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "copyFrom", value.asInstanceOf[js.Any])
    
    inline def setCopyFromFloats(
      value: DeepImmutable[
          js.Function4[
            /* x */ Double, 
            /* y */ Double, 
            /* z */ Double, 
            /* w */ Double, 
            DeepImmutableObjectQuater
          ]
        ]
    ): Self = StObject.set(x, "copyFromFloats", value.asInstanceOf[js.Any])
    
    inline def setDot(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Dot", value.asInstanceOf[js.Any])
    
    inline def setEqualsWithEpsilon(
      value: DeepImmutable[
          js.Function2[
            /* otherQuaternion */ DeepImmutable[DeepImmutableObjectQuater], 
            /* epsilon */ js.UndefOr[Double], 
            Boolean
          ]
        ]
    ): Self = StObject.set(x, "equalsWithEpsilon", value.asInstanceOf[js.Any])
    
    inline def setEquals_(
      value: DeepImmutable[
          js.Function1[/* otherQuaternion */ DeepImmutable[DeepImmutableObjectQuater], Boolean]
        ]
    ): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setFromArray(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromArray", value.asInstanceOf[js.Any])
    
    inline def setFromArrayToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromArrayToRef", value.asInstanceOf[js.Any])
    
    inline def setFromEulerAngles(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromEulerAngles", value.asInstanceOf[js.Any])
    
    inline def setFromEulerAnglesToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromEulerAnglesToRef", value.asInstanceOf[js.Any])
    
    inline def setFromEulerVector(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromEulerVector", value.asInstanceOf[js.Any])
    
    inline def setFromEulerVectorToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromEulerVectorToRef", value.asInstanceOf[js.Any])
    
    inline def setFromLookDirectionLH(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromLookDirectionLH", value.asInstanceOf[js.Any])
    
    inline def setFromLookDirectionLHToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromLookDirectionLHToRef", value.asInstanceOf[js.Any])
    
    inline def setFromLookDirectionRH(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromLookDirectionRH", value.asInstanceOf[js.Any])
    
    inline def setFromLookDirectionRHToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromLookDirectionRHToRef", value.asInstanceOf[js.Any])
    
    inline def setFromRotationMatrix(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromRotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setFromRotationMatrixToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromRotationMatrixToRef", value.asInstanceOf[js.Any])
    
    inline def setFromUnitVectorsToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "FromUnitVectorsToRef", value.asInstanceOf[js.Any])
    
    inline def setGetClassName(value: DeepImmutable[js.Function0[String]]): Self = StObject.set(x, "getClassName", value.asInstanceOf[js.Any])
    
    inline def setGetHashCode(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "getHashCode", value.asInstanceOf[js.Any])
    
    inline def setHermite(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Hermite", value.asInstanceOf[js.Any])
    
    inline def setHermite1stDerivative(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Hermite1stDerivative", value.asInstanceOf[js.Any])
    
    inline def setHermite1stDerivativeToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Hermite1stDerivativeToRef", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setInverse(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Inverse", value.asInstanceOf[js.Any])
    
    inline def setInverseToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "InverseToRef", value.asInstanceOf[js.Any])
    
    inline def setInvert(value: DeepImmutable[js.Function0[DeepImmutableObjectQuater]]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertInPlace(value: DeepImmutable[js.Function0[DeepImmutableObjectQuater]]): Self = StObject.set(x, "invertInPlace", value.asInstanceOf[js.Any])
    
    inline def setIsIdentity(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "IsIdentity", value.asInstanceOf[js.Any])
    
    inline def setLength(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthSquared(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "lengthSquared", value.asInstanceOf[js.Any])
    
    inline def setMultiply(
      value: DeepImmutable[
          js.Function1[/* q1 */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "multiply", value.asInstanceOf[js.Any])
    
    inline def setMultiplyInPlace(
      value: DeepImmutable[
          js.Function1[/* q1 */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "multiplyInPlace", value.asInstanceOf[js.Any])
    
    inline def setMultiplyToRef(
      value: DeepImmutable[
          js.Function2[
            /* q1 */ DeepImmutable[DeepImmutableObjectQuater], 
            DeepImmutableObjectQuater, 
            DeepImmutableObjectQuater
          ]
        ]
    ): Self = StObject.set(x, "multiplyToRef", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: DeepImmutable[js.Function0[DeepImmutableObjectQuater]]): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeToNew(value: DeepImmutable[js.Function0[DeepImmutableObjectQuater]]): Self = StObject.set(x, "normalizeToNew", value.asInstanceOf[js.Any])
    
    inline def setRotationAlphaBetaGamma(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationAlphaBetaGamma", value.asInstanceOf[js.Any])
    
    inline def setRotationAlphaBetaGammaToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationAlphaBetaGammaToRef", value.asInstanceOf[js.Any])
    
    inline def setRotationAxis(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationAxis", value.asInstanceOf[js.Any])
    
    inline def setRotationAxisToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationAxisToRef", value.asInstanceOf[js.Any])
    
    inline def setRotationQuaternionFromAxis(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationQuaternionFromAxis", value.asInstanceOf[js.Any])
    
    inline def setRotationQuaternionFromAxisToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationQuaternionFromAxisToRef", value.asInstanceOf[js.Any])
    
    inline def setRotationQuaternionFromOnto(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationQuaternionFromOnto", value.asInstanceOf[js.Any])
    
    inline def setRotationQuaternionFromOntoToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationQuaternionFromOntoToRef", value.asInstanceOf[js.Any])
    
    inline def setRotationYawPitchRoll(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationYawPitchRoll", value.asInstanceOf[js.Any])
    
    inline def setRotationYawPitchRollToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "RotationYawPitchRollToRef", value.asInstanceOf[js.Any])
    
    inline def setScale(value: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuater]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleAndAddToRef(
      value: DeepImmutable[
          js.Function2[/* scale */ Double, DeepImmutableObjectQuater, DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "scaleAndAddToRef", value.asInstanceOf[js.Any])
    
    inline def setScaleInPlace(value: DeepImmutable[js.Function1[/* value */ Double, DeepImmutableObjectQuater]]): Self = StObject.set(x, "scaleInPlace", value.asInstanceOf[js.Any])
    
    inline def setScaleToRef(
      value: DeepImmutable[
          js.Function2[/* scale */ Double, DeepImmutableObjectQuater, DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "scaleToRef", value.asInstanceOf[js.Any])
    
    inline def setSet(
      value: DeepImmutable[
          js.Function4[
            /* x */ Double, 
            /* y */ Double, 
            /* z */ Double, 
            /* w */ Double, 
            DeepImmutableObjectQuater
          ]
        ]
    ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSlerp(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Slerp", value.asInstanceOf[js.Any])
    
    inline def setSlerpToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "SlerpToRef", value.asInstanceOf[js.Any])
    
    inline def setSmoothToRef(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "SmoothToRef", value.asInstanceOf[js.Any])
    
    inline def setSubtract(value: DeepImmutable[js.Function1[DeepImmutableObjectQuater, DeepImmutableObjectQuater]]): Self = StObject.set(x, "subtract", value.asInstanceOf[js.Any])
    
    inline def setSubtractInPlace(
      value: DeepImmutable[
          js.Function1[/* other */ DeepImmutable[DeepImmutableObjectQuater], DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "subtractInPlace", value.asInstanceOf[js.Any])
    
    inline def setToArray(
      value: DeepImmutable[
          js.Function2[/* array */ FloatArray, /* index */ js.UndefOr[Double], DeepImmutableObjectQuater]
        ]
    ): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
    
    inline def setToEulerAngles(value: DeepImmutable[js.Function0[Vector3]]): Self = StObject.set(x, "toEulerAngles", value.asInstanceOf[js.Any])
    
    inline def setToEulerAnglesToRef(value: DeepImmutable[js.Function1[/* result */ Vector3, Vector3]]): Self = StObject.set(x, "toEulerAnglesToRef", value.asInstanceOf[js.Any])
    
    inline def setToRotationMatrix(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = StObject.set(x, "toRotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setToString_(value: DeepImmutable[js.Function0[String]]): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
    
    inline def setW(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZero(value: DeepImmutable[js.UndefOr[Any]]): Self = StObject.set(x, "Zero", value.asInstanceOf[js.Any])
    
    inline def set_isDirty(value: DeepImmutable[Boolean]): Self = StObject.set(x, "_isDirty", value.asInstanceOf[js.Any])
    
    inline def set_w(value: DeepImmutable[Double]): Self = StObject.set(x, "_w", value.asInstanceOf[js.Any])
    
    inline def set_x(value: DeepImmutable[Double]): Self = StObject.set(x, "_x", value.asInstanceOf[js.Any])
    
    inline def set_y(value: DeepImmutable[Double]): Self = StObject.set(x, "_y", value.asInstanceOf[js.Any])
    
    inline def set_z(value: DeepImmutable[Double]): Self = StObject.set(x, "_z", value.asInstanceOf[js.Any])
  }
}
