package typings.crocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.crocks.internalTypesMod.BinaryFunction
import typings.crocks.internalTypesMod.PredicateFunction
import typings.crocks.internalTypesMod.TernaryFunction
import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.internalTypesMod.VariadicFunction
import typings.crocks.mod.^
import typings.std.Exclude
import typings.std.Omit
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def and[A](p: PredicateFunction[A]): js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]]]
inline def and[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
/**
  * and :: ((a -> Boolean) | Pred a) -> ((a -> Boolean) | Pred a) -> a -> Boolean
  */
inline def and[A](p: PredicateFunction[A], q: PredicateFunction[A], x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def and[A](p: PredicateFunction[A], q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def and[A](p: PredicateFunction[A], q: typings.crocks.predMod.default, x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def and[A](p: typings.crocks.predMod.default): js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]]]
inline def and[A](p: typings.crocks.predMod.default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def and[A](p: typings.crocks.predMod.default, q: PredicateFunction[A], x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def and[A](p: typings.crocks.predMod.default, q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def and[A](p: typings.crocks.predMod.default, q: typings.crocks.predMod.default, x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def applyTo[A, B](`val`: A): js.Function1[/* fn */ js.Function1[/* x */ A, B], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTo")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ js.Function1[/* x */ A, B], B]]
inline def applyTo[A, B](`val`: A, fn: js.Function1[/* x */ A, B]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTo")(`val`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[B]

inline def assign(a: js.Object): js.Function1[/* b */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ js.Object, js.Object]]
inline def assign(a: js.Object, b: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def binary[C](fn: js.Function1[/* repeated */ scala.Any, C]): js.Function1[/* a */ scala.Any, js.Function1[/* b */ scala.Any, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("binary")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ scala.Any, js.Function1[/* b */ scala.Any, C]]]

inline def binary_C_Function2[C](fn: js.Function1[/* repeated */ scala.Any, C]): js.Function2[/* a */ scala.Any, /* b */ scala.Any, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("binary")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ scala.Any, /* b */ scala.Any, C]]

inline def compose[Z](
  f: js.Array[js.Function1[/* y */ scala.Any, Z]],
  g: js.Function1[/* repeated */ scala.Any, scala.Any]
): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]

inline def compose2[A, B, C, D, E](f: js.Function2[/* c */ C, /* d */ D, E]): js.Function1[
/* d */ js.Function1[/* a */ A, C], 
js.Function1[
  /* h */ js.Function1[/* b */ B, D], 
  js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose2")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* d */ js.Function1[/* a */ A, C], 
js.Function1[
  /* h */ js.Function1[/* b */ B, D], 
  js.Function1[/* x */ A, js.Function1[/* y */ B, E]]
]]]
inline def compose2[A, B, C, D, E](f: js.Function2[/* c */ C, /* d */ D, E], d: js.Function1[/* a */ A, C]): js.Function1[
/* h */ js.Function1[/* b */ B, D], 
js.Function1[/* x */ A, js.Function1[/* y */ B, E]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose2")(f.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* h */ js.Function1[/* b */ B, D], 
js.Function1[/* x */ A, js.Function1[/* y */ B, E]]]]
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

inline def composeK[Z](
  f: js.Array[js.Function1[/* y */ scala.Any, Z]],
  g: js.Function1[/* repeated */ scala.Any, scala.Any]
): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("composeK")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]

inline def composeP[Z](
  f: js.Array[js.Function1[/* y */ scala.Any, js.Array[js.Promise[Z]]]],
  g: js.Function1[/* repeated */ js.Promise[scala.Any], scala.Any]
): js.Promise[Z] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeP")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Z]]

inline def composeS[Z](
  f: js.Array[js.Function1[/* y */ scala.Any, Z]],
  g: js.Function1[/* repeated */ scala.Any, scala.Any]
): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("composeS")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]

inline def constant(`val`: scala.Any): js.Function0[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[scala.Any]]

inline def converge(f: BinaryFunction): js.Function1[/* g */ UnaryFunction, js.Function1[/* h */ UnaryFunction, UnaryFunction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("converge")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ UnaryFunction, js.Function1[/* h */ UnaryFunction, UnaryFunction]]]
inline def converge(f: BinaryFunction, g: UnaryFunction): js.Function1[/* h */ UnaryFunction, UnaryFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* h */ UnaryFunction, UnaryFunction]]
/**
  * The Phoenix or Starling Prime
  * converge :: (b -> c -> d) -> (a -> b) -> (a -> c) -> a -> d
  */
inline def converge(f: BinaryFunction, g: UnaryFunction, h: UnaryFunction): UnaryFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction]

/**
  * curry :: ((a, b, ...) -> z) -> a -> b -> ... -> z
  */
inline def curry(fn: VariadicFunction): scala.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Any]

inline def defaultProps(a: js.Object): js.Function1[/* b */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProps")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ js.Object, js.Object]]
inline def defaultProps(a: js.Object, b: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultProps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def defaultTo[A](a: A): js.Function1[/* b */ scala.Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTo")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ scala.Any, A]]
inline def defaultTo[A](a: A, b: scala.Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]

inline def flip[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function1[/* y */ B, js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ B, js.Function1[/* x */ A, C]]]

inline def flip_ABC_Function2[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* y */ B, /* x */ A, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* y */ B, /* x */ A, C]]

/**
  * fromPairs :: Foldable f => f (Pair String a) -> Object
  */
inline def fromPairs(`val`: js.Array[typings.crocks.pairMod.default]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPairs")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
inline def fromPairs(`val`: typings.crocks.listListMod.List): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPairs")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Object]

inline def getPathOr[A /* <: scala.Any */](a: A): js.Function1[/* p */ js.Array[String | Double], js.Function1[/* b */ scala.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathOr")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ js.Array[String | Double], js.Function1[/* b */ scala.Any, A]]]
inline def getPathOr[A /* <: scala.Any */](a: A, p: js.Array[String | Double]): js.Function1[/* b */ scala.Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ scala.Any, A]]
inline def getPathOr[A /* <: scala.Any */](a: A, p: js.Array[String | Double], b: scala.Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]

inline def getPropOr[A /* <: scala.Any */](a: A): js.Function1[/* p */ String | Double, js.Function1[/* b */ scala.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ String | Double, js.Function1[/* b */ scala.Any, A]]]
inline def getPropOr[A /* <: scala.Any */](a: A, p: String): js.Function1[/* b */ scala.Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ scala.Any, A]]
inline def getPropOr[A /* <: scala.Any */](a: A, p: String, b: scala.Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
inline def getPropOr[A /* <: scala.Any */](a: A, p: Double): js.Function1[/* b */ scala.Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ scala.Any, A]]
inline def getPropOr[A /* <: scala.Any */](a: A, p: Double, b: scala.Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]

inline def hasProp(prop: String): js.Function1[/* val */ scala.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ scala.Any, Boolean]]
inline def hasProp(prop: String, `val`: scala.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def hasProp(prop: Double): js.Function1[/* val */ scala.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ scala.Any, Boolean]]
inline def hasProp(prop: Double, `val`: scala.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def hasPropPath(path: js.Array[String | Double]): js.Function1[/* val */ scala.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPropPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ scala.Any, Boolean]]
inline def hasPropPath(path: js.Array[String | Double], `val`: scala.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPropPath")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def hasProps(props: js.Array[String | Double]): js.Function1[/* val */ scala.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ scala.Any, Boolean]]
inline def hasProps(props: js.Array[String | Double], `val`: scala.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProps")(props.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def identity[A](x: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[A]

inline def ifElse[A, C](p: PredicateFunction[A]): js.Function1[
/* f */ js.Function1[/* x */ A, scala.Any], 
js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* f */ js.Function1[/* x */ A, scala.Any], 
js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]]
inline def ifElse[A, C](p: PredicateFunction[A], f: js.Function1[/* x */ A, scala.Any]): js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]
/**
  * ifElse :: ((a -> Boolean) | Pred a) -> (a -> b) -> (a -> b) -> a -> b
  */
inline def ifElse[A, C](p: PredicateFunction[A], f: js.Function1[/* x */ A, scala.Any], g: js.Function1[/* x */ A, C]): js.Function1[/* x */ A, A | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | C]]
inline def ifElse[A, C](p: typings.crocks.predMod.default): js.Function1[
/* f */ js.Function1[/* x */ A, scala.Any], 
js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* f */ js.Function1[/* x */ A, scala.Any], 
js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]]
inline def ifElse[A, C](p: typings.crocks.predMod.default, f: js.Function1[/* x */ A, scala.Any]): js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]
inline def ifElse[A, C](
  p: typings.crocks.predMod.default,
  f: js.Function1[/* x */ A, scala.Any],
  g: js.Function1[/* x */ A, C]
): js.Function1[/* x */ A, A | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | C]]

inline def implies[A](p: PredicateFunction[A]): js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]]]
/**
  * implies :: ((a -> Boolean) | Pred a) -> ((a -> Boolean) | Pred a) -> a -> Boolean
  */
inline def implies[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def implies[A](p: PredicateFunction[A], q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def implies[A](p: typings.crocks.predMod.default): js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]]]
inline def implies[A](p: typings.crocks.predMod.default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def implies[A](p: typings.crocks.predMod.default, q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]

inline def isAlt(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlt")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isAlternative(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlternative")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isApplicative(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApplicative")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isApply(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isApply")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isArray(`val`: scala.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]

inline def isBifunctor(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBifunctor")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isBoolean(`val`: scala.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]

inline def isCategory(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCategory")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isChain(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChain")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isContravariant(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContravariant")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDate(`val`: scala.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]

inline def isDefined(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isEmpty(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isExtend(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtend")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFalse(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalse")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFalsy(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalsy")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFoldable(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFoldable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * isFunction :: a -> Boolean
  */
inline def isFunction(`val`: scala.Any): /* is crocks.crocks/predicates/isFunction.Fn */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is crocks.crocks/predicates/isFunction.Fn */ Boolean]

inline def isFunctor(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctor")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isInteger(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isIterable(`val`: scala.Any): /* is std.Iterable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Iterable<any> */ Boolean]

inline def isMap(`val`: scala.Any): /* is std.Map<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<any, any> */ Boolean]

inline def isMonad(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonad")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isMonoid(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonoid")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNil(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNumber(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isObject(`val`: scala.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]

inline def isPlus(`val`: scala.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlus")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]

inline def isProfunctor(`val`: scala.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProfunctor")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]

inline def isPromise(`val`: scala.Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]

inline def isSame(val1: scala.Any): js.Function1[/* val2 */ scala.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSame")(val1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val2 */ scala.Any, Boolean]]
inline def isSame(val1: scala.Any, val2: scala.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSame")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isSameType(val1: scala.Any): js.Function1[/* val2 */ scala.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameType")(val1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val2 */ scala.Any, Boolean]]
inline def isSameType(val1: scala.Any, val2: scala.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameType")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isSemigroup(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemigroup")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSemigroupoid(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemigroupoid")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSetoid(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetoid")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isString(`val`: scala.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]

inline def isSymbol(`val`: scala.Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]

inline def isTraversable(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTraversable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTrue(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTruthy(`val`: scala.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTruthy")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def liftA2(fn: BinaryFunction): js.Function1[/* a */ scala.Any, js.Function1[/* b */ scala.Any, scala.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA2")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ scala.Any, js.Function1[/* b */ scala.Any, scala.Any]]]

/**
  * liftA2 :: Applicative m => (a -> b -> c) -> m a -> m b -> m c
  */
inline def liftA2_Function2(fn: BinaryFunction): js.Function2[/* a */ scala.Any, /* b */ scala.Any, scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA2")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ scala.Any, /* b */ scala.Any, scala.Any]]

inline def liftA3(fn: TernaryFunction): js.Function1[
/* a */ scala.Any, 
js.Function1[/* b */ scala.Any, js.Function1[/* c */ scala.Any, scala.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA3")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* a */ scala.Any, 
js.Function1[/* b */ scala.Any, js.Function1[/* c */ scala.Any, scala.Any]]]]

inline def liftA3_Function2(fn: TernaryFunction): js.Function2[/* a */ scala.Any, /* b */ scala.Any, js.Function1[/* c */ scala.Any, scala.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA3")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ scala.Any, /* b */ scala.Any, js.Function1[/* c */ scala.Any, scala.Any]]]

/**
  * liftA3 :: Applicative m => (a -> b -> c -> d) -> m a -> m b -> m c -> m d
  */
inline def liftA3_Function3(fn: TernaryFunction): js.Function3[/* a */ scala.Any, /* b */ scala.Any, /* c */ scala.Any, scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA3")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ scala.Any, /* b */ scala.Any, /* c */ scala.Any, scala.Any]]

/**
  * liftN :: Applicative m => Number -> ((*) -> a) -> (*m) -> m a
  */
inline def liftN(n: Double, fn: VariadicFunction): VariadicFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("liftN")(n.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[VariadicFunction]

inline def mapProps(m: StringDictionary[VariadicFunction]): js.Function1[/* o */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapProps")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* o */ js.Object, js.Object]]
/**
  * mapProps :: { (* -> *) } -> Object -> Object
  */
inline def mapProps(m: StringDictionary[VariadicFunction], o: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mapProps")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def mapReduce[C](fn1: UnaryFunction): js.Function1[
/* fn2 */ BinaryFunction, 
js.Function1[/* c */ C, js.Function1[/* f */ js.Array[scala.Any], C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* fn2 */ BinaryFunction, 
js.Function1[/* c */ C, js.Function1[/* f */ js.Array[scala.Any], C]]]]
inline def mapReduce[C](fn1: UnaryFunction, fn2: BinaryFunction): js.Function1[/* c */ C, js.Function1[/* f */ js.Array[scala.Any], C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* c */ C, js.Function1[/* f */ js.Array[scala.Any], C]]]
inline def mapReduce[C](fn1: UnaryFunction, fn2: BinaryFunction, c: C): js.Function1[/* f */ js.Array[scala.Any], C] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Array[scala.Any], C]]
/**
  * mapReduce :: Foldable f => (a -> b) -> (c -> b -> c) -> c -> f a -> c
  */
inline def mapReduce[C](fn1: UnaryFunction, fn2: BinaryFunction, c: C, f: js.Array[scala.Any]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], c.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[C]

inline def mconcat(m: js.Object): js.Function1[/* f */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("mconcat")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Object, js.Object]]
inline def mconcat(m: js.Object, f: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mconcat")(m.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def mconcatMap(m: js.Object): js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mconcatMap")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, js.Object]]]
inline def mconcatMap(m: js.Object, fn: UnaryFunction): js.Function1[/* f */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("mconcatMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Object, js.Object]]
/**
  * mconcatMap :: Monoid m, Foldable f => m -> (b -> a) -> f b -> m a
  */
inline def mconcatMap(m: js.Object, fn: UnaryFunction, f: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mconcatMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def mreduce(m: js.Object): js.Function1[/* f */ js.Object, scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mreduce")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Object, scala.Any]]
inline def mreduce(m: js.Object, f: js.Object): scala.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mreduce")(m.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[scala.Any]

inline def mreduceMap(m: js.Object): js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, scala.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mreduceMap")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, scala.Any]]]
inline def mreduceMap(m: js.Object, fn: UnaryFunction): js.Function1[/* f */ js.Object, scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mreduceMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Object, scala.Any]]
/**
  * mreduceMap :: Monoid m, Foldable f => m -> (b -> a) -> f b -> a
  */
inline def mreduceMap(m: js.Object, fn: UnaryFunction, f: js.Object): scala.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mreduceMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[scala.Any]

inline def nAry(n: Double): js.Function1[/* fn */ VariadicFunction, VariadicFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("nAry")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ VariadicFunction, VariadicFunction]]
/**
  * nAry :: Number -> ((*) -> a) -> (*) -> a
  */
inline def nAry(n: Double, fn: VariadicFunction): VariadicFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("nAry")(n.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[VariadicFunction]

/**
  * not :: ((a -> Boolean) | Pred) -> a -> Boolean
  */
inline def not[A](p: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def not[A](p: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]

inline def objOf[A](k: String): js.Function1[/* a */ A, StringDictionary[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objOf")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StringDictionary[A]]]
inline def objOf[A](k: String, a: A): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("objOf")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]

inline def omit[O, K /* <: String */](ks: js.Array[K]): js.Function1[/* o */ O, Omit[O, K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(ks.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* o */ O, Omit[O, K]]]
inline def omit[O, K /* <: String */](ks: js.Array[K], o: O): Omit[O, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(ks.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Omit[O, K]]

/**
  * once :: ((*) -> a) -> ((*) -> a)
  */
inline def once(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]

inline def or[A](p: PredicateFunction[A]): js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]]]
/**
  * or :: ((a -> Boolean) | Pred) -> ((a -> Boolean) | Pred) -> a -> Boolean
  */
inline def or[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def or[A](p: PredicateFunction[A], q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def or[A](p: typings.crocks.predMod.default): js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* q */ PredicateFunction[A] | typings.crocks.predMod.default, 
js.Function1[/* x */ A, Boolean]]]
inline def or[A](p: typings.crocks.predMod.default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
inline def or[A](p: typings.crocks.predMod.default, q: typings.crocks.predMod.default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]

/**
  * partial :: (((*) -> c), *) -> (*) -> c
  */
inline def partial(fn: VariadicFunction, args: scala.Any*): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(scala.List(fn.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VariadicFunction]

inline def pathEq(path: js.Array[String | Double]): js.Function1[/* val */ scala.Any, js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathEq")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ scala.Any, js.Function1[/* obj */ js.Object, Boolean]]]
inline def pathEq(path: js.Array[String | Double], `val`: scala.Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathEq")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
inline def pathEq(path: js.Array[String | Double], `val`: scala.Any, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathEq")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def pathSatisfies(path: js.Array[String | Double]): js.Function1[
/* pred */ js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default], 
js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* pred */ js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default], 
js.Function1[/* obj */ js.Object, Boolean]]]
inline def pathSatisfies(
  path: js.Array[String | Double],
  pred: js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default]
): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
inline def pathSatisfies(
  path: js.Array[String | Double],
  pred: js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default],
  obj: js.Object
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def pick[O, K /* <: String */](ks: js.Array[K]): js.Function1[
/* o */ O, 
Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(ks.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* o */ O, 
Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]]]
inline def pick[O, K /* <: String */](ks: js.Array[K], o: O): Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(ks.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]]

inline def pipe[Z](
  f: js.Function1[/* repeated */ scala.Any, scala.Any],
  g: js.Array[js.Function1[/* y */ scala.Any, Z]]
): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]

inline def pipeK[Z](
  f: js.Function1[/* repeated */ scala.Any, scala.Any],
  g: js.Array[js.Function1[/* y */ scala.Any, Z]]
): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeK")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]

inline def pipeP[Z](
  f: js.Function1[/* repeated */ scala.Any, scala.Any],
  g: js.Array[js.Function1[/* y */ scala.Any, Z]]
): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeP")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]

inline def pipeS[Z](
  f: js.Function1[/* repeated */ scala.Any, scala.Any],
  g: js.Array[js.Function1[/* y */ scala.Any, Z]]
): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeS")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]

inline def propEq(prop: String): js.Function1[/* val */ scala.Any, js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ scala.Any, js.Function1[/* obj */ js.Object, Boolean]]]
inline def propEq(prop: String, `val`: scala.Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
inline def propEq(prop: String, `val`: scala.Any, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def propEq(prop: Double): js.Function1[/* val */ scala.Any, js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ scala.Any, js.Function1[/* obj */ js.Object, Boolean]]]
inline def propEq(prop: Double, `val`: scala.Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
inline def propEq(prop: Double, `val`: scala.Any, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def propSatisfies(prop: String): js.Function1[
/* pred */ js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default], 
js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* pred */ js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default], 
js.Function1[/* obj */ js.Object, Boolean]]]
inline def propSatisfies(prop: String, pred: js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
/**
  * propSatisfies :: (String | Integer) -> ((a -> Boolean) | Pred) -> Object -> Boolean
  */
inline def propSatisfies(
  prop: String,
  pred: js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default],
  obj: js.Object
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def propSatisfies(prop: Double): js.Function1[
/* pred */ js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default], 
js.Function1[/* obj */ js.Object, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* pred */ js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default], 
js.Function1[/* obj */ js.Object, Boolean]]]
inline def propSatisfies(prop: Double, pred: js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
inline def propSatisfies(
  prop: Double,
  pred: js.Function1[/* val */ scala.Any, Boolean | typings.crocks.predMod.default],
  obj: js.Object
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propSatisfies")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def psi[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C]): js.Function1[
/* g */ js.Function1[/* a */ A, B], 
js.Function1[/* x */ A, js.Function1[/* y */ A, C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("psi")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* g */ js.Function1[/* a */ A, B], 
js.Function1[/* x */ A, js.Function1[/* y */ A, C]]]]
inline def psi[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, js.Function1[/* y */ A, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("psi")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, js.Function1[/* y */ A, C]]]

inline def psi_ABC_Function2[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* a */ A, B]): js.Function2[/* x */ A, /* y */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("psi")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, C]]

inline def setPath(path: js.Array[String | Double], `val`: scala.Any): js.Function1[/* obj */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
inline def setPath(path: js.Array[String | Double], `val`: scala.Any, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def setProp(prop: String, `val`: scala.Any): js.Function1[/* obj */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
inline def setProp(prop: String, `val`: scala.Any, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
inline def setProp(prop: Double, `val`: scala.Any): js.Function1[/* obj */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
inline def setProp(prop: Double, `val`: scala.Any, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def substitution[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("substitution")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]]]
inline def substitution[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("substitution")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, C]]
inline def substitution[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], g: js.Function1[/* a */ A, B], x: A): C = (^.asInstanceOf[js.Dynamic].applyDynamic("substitution")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[C]

inline def tap[A](fn: js.Function1[/* a */ A, scala.Any]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]

/**
  * tryCatch :: ((*) -> b) -> (*) -> Result e b
  */
inline def tryCatch(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]

/**
  * unary :: ((*) -> b) -> a -> b
  */
inline def unary(fn: VariadicFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("unary")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]

inline def unit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unit")().asInstanceOf[Unit]

inline def unless[A, B](p: PredicateFunction[A]): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
/**
  * unless :: ((a -> Boolean) | Pred) -> (a -> a) -> a -> a
  */
inline def unless[A, B](p: PredicateFunction[A], f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
inline def unless[A, B](p: typings.crocks.predMod.default): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
inline def unless[A, B](p: typings.crocks.predMod.default, f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]

inline def unsetPath(path: js.Array[String | Double]): js.Function1[/* obj */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
inline def unsetPath(path: js.Array[String | Double], obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetPath")(path.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def unsetProp(prop: String): js.Function1[/* obj */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
inline def unsetProp(prop: String, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
inline def unsetProp(prop: Double): js.Function1[/* obj */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
inline def unsetProp(prop: Double, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def when[A, B](p: PredicateFunction[A]): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
/**
  * when :: ((a -> Boolean) | Pred) -> (a -> a) -> a -> a
  */
inline def when[A, B](p: PredicateFunction[A], f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
inline def when[A, B](p: typings.crocks.predMod.default): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
inline def when[A, B](p: typings.crocks.predMod.default, f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
