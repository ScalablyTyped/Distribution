package typings.csstoolsPostcssTrigonometricFunctions

import typings.csstoolsPostcssTrigonometricFunctions.anon.Number
import typings.csstoolsPostcssTrigonometricFunctions.csstoolsPostcssTrigonometricFunctionsBooleans.`false`
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCalculation(nodes: js.Array[Node]): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCalculation")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  inline def computeCalculation(nodes: js.Array[Node], ignoreUnit: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCalculation")(nodes.asInstanceOf[js.Any], ignoreUnit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  inline def degToRad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degToRad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def filterOnlyWords(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("filterOnlyWords")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def formatResultingNumber(number: Double, decimals: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatResultingNumber")(number.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def functionNodeToWordNode(
    fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionNodeToWordNode")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def gradToDeg(grad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gradToDeg")(grad.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def gradToRad(grad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gradToRad")(grad.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseNumber(value: String): `false` | Number = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(value.asInstanceOf[js.Any]).asInstanceOf[`false` | Number]
  
  inline def radToDeg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radToDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object toDeg {
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toDeg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toDeg.grad")
    @js.native
    def grad: js.Function1[/* grad */ Double, Double] = js.native
    inline def grad(grad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("grad")(grad.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def grad_=(x: js.Function1[/* grad */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grad")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toDeg.rad")
    @js.native
    def rad: js.Function1[/* rad */ Double, Double] = js.native
    inline def rad(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rad")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def rad_=(x: js.Function1[/* rad */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rad")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toDeg.turn")
    @js.native
    def turn: js.Function1[/* turn */ Double, Double] = js.native
    inline def turn(turn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("turn")(turn.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def turn_=(x: js.Function1[/* turn */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("turn")(x.asInstanceOf[js.Any])
  }
  
  object toRad {
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toRad")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toRad.deg")
    @js.native
    def deg: js.Function1[/* deg */ Double, Double] = js.native
    inline def deg(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def deg_=(x: js.Function1[/* deg */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deg")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toRad.grad")
    @js.native
    def grad: js.Function1[/* grad */ Double, Double] = js.native
    inline def grad(grad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("grad")(grad.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def grad_=(x: js.Function1[/* grad */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grad")(x.asInstanceOf[js.Any])
    
    @JSImport("@csstools/postcss-trigonometric-functions/dist/utils", "toRad.turn")
    @js.native
    def turn: js.Function1[/* turn */ Double, Double] = js.native
    inline def turn(turn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("turn")(turn.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def turn_=(x: js.Function1[/* turn */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("turn")(x.asInstanceOf[js.Any])
  }
  
  inline def turnToDeg(turn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("turnToDeg")(turn.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def turnToRad(turn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("turnToRad")(turn.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def validateNode(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any
  ): validateNodeReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNode")(node.asInstanceOf[js.Any]).asInstanceOf[validateNodeReturn]
  inline def validateNode(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any,
    parseUnit: Boolean
  ): validateNodeReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNode")(node.asInstanceOf[js.Any], parseUnit.asInstanceOf[js.Any])).asInstanceOf[validateNodeReturn]
  
  type validateNodeReturn = js.UndefOr[
    js.Tuple2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WordNode */ Any, 
      Double
    ]
  ]
}
