package typings.crocks

import typings.crocks.internalTypesMod.BinaryFunction
import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinatorsMod {
  
  @JSImport("crocks/combinators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyTo[A, B](`val`: A): js.Function1[/* fn */ js.Function1[/* x */ A, B], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTo")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ js.Function1[/* x */ A, B], B]]
  inline def applyTo[A, B](`val`: A, fn: js.Function1[/* x */ A, B]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTo")(`val`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[B]
  
  inline def compose2[A, B, C, D, E](f: js.Function2[/* c */ C, /* d */ D, E]): js.Function1[
    /* d */ js.Function1[/* a */ A, C], 
    js.Function1[
      /* h */ js.Function1[/* b */ B, D], 
      js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose2")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* d */ js.Function1[/* a */ A, C], 
    js.Function1[
      /* h */ js.Function1[/* b */ B, D], 
      js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
    ]
  ]]
  inline def compose2[A, B, C, D, E](f: js.Function2[/* c */ C, /* d */ D, E], d: js.Function1[/* a */ A, C]): js.Function1[
    /* h */ js.Function1[/* b */ B, D], 
    js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose2")(f.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* h */ js.Function1[/* b */ B, D], 
    js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
  ]]
  inline def compose2[A, B, C, D, E](
    f: js.Function2[/* c */ C, /* d */ D, E],
    d: js.Function1[/* a */ A, C],
    h: js.Function1[/* b */ B, D]
  ): js.Function2[/* x */ A, /* y */ B, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose2")(f.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ B, E]]
  
  inline def compose2_ABCDE_Function1[A, B, C, D, E](
    f: js.Function2[/* c */ C, /* d */ D, E],
    d: js.Function1[/* a */ A, C],
    h: js.Function1[/* b */ B, D]
  ): js.Function1[/* x */ A, js.Function1[/* y */ B, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose2")(f.asInstanceOf[js.Any], d.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, js.Function1[/* y */ B, E]]]
  
  inline def composeB[A, B, C](f: js.Function1[/* b */ B, C]): js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeB")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]]]
  inline def composeB[A, B, C](f: js.Function1[/* b */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeB")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, C]]
  
  inline def constant(`val`: Any): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Any]]
  
  inline def converge(f: BinaryFunction): js.Function1[/* g */ UnaryFunction, js.Function1[/* h */ UnaryFunction, UnaryFunction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("converge")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ UnaryFunction, js.Function1[/* h */ UnaryFunction, UnaryFunction]]]
  inline def converge(f: BinaryFunction, g: UnaryFunction): js.Function1[/* h */ UnaryFunction, UnaryFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* h */ UnaryFunction, UnaryFunction]]
  /**
    * The Phoenix or Starling Prime
    * converge :: (b -> c -> d) -> (a -> b) -> (a -> c) -> a -> d
    */
  inline def converge(f: BinaryFunction, g: UnaryFunction, h: UnaryFunction): UnaryFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction]
  
  inline def flip[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function1[/* y */ B, js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ B, js.Function1[/* x */ A, C]]]
  
  inline def flip_ABC_Function2[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* y */ B, /* x */ A, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* y */ B, /* x */ A, C]]
  
  inline def identity[A](x: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def psi[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C]): js.Function1[
    /* g */ js.Function1[/* a */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("psi")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* g */ js.Function1[/* a */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ]]
  inline def psi[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, js.Function1[/* y */ A, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("psi")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, js.Function1[/* y */ A, C]]]
  
  inline def psi_ABC_Function2[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* a */ A, B]): js.Function2[/* x */ A, /* y */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("psi")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, C]]
  
  inline def substitution[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("substitution")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]]]
  inline def substitution[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("substitution")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, C]]
  inline def substitution[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], g: js.Function1[/* a */ A, B], x: A): C = (^.asInstanceOf[js.Dynamic].applyDynamic("substitution")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[C]
}
