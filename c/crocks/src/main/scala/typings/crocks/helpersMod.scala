package typings.crocks

import org.scalablytyped.runtime.StringDictionary
import typings.crocks.listListMod.List
import typings.crocks.pairMod.default
import typings.crocks.typesMod.BinaryFunction
import typings.crocks.typesMod.TernaryFunction
import typings.crocks.typesMod.UnaryFunction
import typings.crocks.typesMod.VariadicFunction
import typings.std.Exclude
import typings.std.Omit
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("crocks/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(a: js.Object): js.Function1[/* b */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ js.Object, js.Object]]
  inline def assign(a: js.Object, b: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def binary[C](fn: js.Function1[/* repeated */ Any, C]): js.Function1[/* a */ Any, js.Function1[/* b */ Any, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("binary")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, js.Function1[/* b */ Any, C]]]
  
  inline def binary_C_Function2[C](fn: js.Function1[/* repeated */ Any, C]): js.Function2[/* a */ Any, /* b */ Any, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("binary")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, C]]
  
  inline def compose[Z](f: js.Array[js.Function1[/* y */ Any, Z]], g: js.Function1[/* repeated */ Any, Any]): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]
  
  inline def composeK[Z](f: js.Array[js.Function1[/* y */ Any, Z]], g: js.Function1[/* repeated */ Any, Any]): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("composeK")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]
  
  inline def composeP[Z](
    f: js.Array[js.Function1[/* y */ Any, js.Array[js.Promise[Z]]]],
    g: js.Function1[/* repeated */ js.Promise[Any], Any]
  ): js.Promise[Z] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeP")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Z]]
  
  inline def composeS[Z](f: js.Array[js.Function1[/* y */ Any, Z]], g: js.Function1[/* repeated */ Any, Any]): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("composeS")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]
  
  /**
    * curry :: ((a, b, ...) -> z) -> a -> b -> ... -> z
    */
  inline def curry(fn: VariadicFunction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def defaultProps(a: js.Object): js.Function1[/* b */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProps")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ js.Object, js.Object]]
  inline def defaultProps(a: js.Object, b: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultProps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def defaultTo[A](a: A): js.Function1[/* b */ Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTo")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def defaultTo[A](a: A, b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
  
  /**
    * fromPairs :: Foldable f => f (Pair String a) -> Object
    */
  inline def fromPairs(`val`: js.Array[default]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPairs")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def fromPairs(`val`: List): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPairs")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getPathOr[A /* <: Any */](a: A): js.Function1[/* p */ js.Array[String | Double], js.Function1[/* b */ Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathOr")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ js.Array[String | Double], js.Function1[/* b */ Any, A]]]
  inline def getPathOr[A /* <: Any */](a: A, p: js.Array[String | Double]): js.Function1[/* b */ Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def getPathOr[A /* <: Any */](a: A, p: js.Array[String | Double], b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def getPropOr[A /* <: Any */](a: A): js.Function1[/* p */ String | Double, js.Function1[/* b */ Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* p */ String | Double, js.Function1[/* b */ Any, A]]]
  inline def getPropOr[A /* <: Any */](a: A, p: String): js.Function1[/* b */ Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def getPropOr[A /* <: Any */](a: A, p: String, b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
  inline def getPropOr[A /* <: Any */](a: A, p: Double): js.Function1[/* b */ Any, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ Any, A]]
  inline def getPropOr[A /* <: Any */](a: A, p: Double, b: Any): A = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropOr")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[A]
  
  inline def liftA2(fn: BinaryFunction): js.Function1[/* a */ Any, js.Function1[/* b */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA2")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, js.Function1[/* b */ Any, Any]]]
  
  /**
    * liftA2 :: Applicative m => (a -> b -> c) -> m a -> m b -> m c
    */
  inline def liftA2_Function2(fn: BinaryFunction): js.Function2[/* a */ Any, /* b */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA2")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Any]]
  
  inline def liftA3(fn: TernaryFunction): js.Function1[/* a */ Any, js.Function1[/* b */ Any, js.Function1[/* c */ Any, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA3")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, js.Function1[/* b */ Any, js.Function1[/* c */ Any, Any]]]]
  
  inline def liftA3_Function2(fn: TernaryFunction): js.Function2[/* a */ Any, /* b */ Any, js.Function1[/* c */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA3")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, js.Function1[/* c */ Any, Any]]]
  
  /**
    * liftA3 :: Applicative m => (a -> b -> c -> d) -> m a -> m b -> m c -> m d
    */
  inline def liftA3_Function3(fn: TernaryFunction): js.Function3[/* a */ Any, /* b */ Any, /* c */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftA3")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ Any, /* b */ Any, /* c */ Any, Any]]
  
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
    js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fn2 */ BinaryFunction, 
    js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]]
  ]]
  inline def mapReduce[C](fn1: UnaryFunction, fn2: BinaryFunction): js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* c */ C, js.Function1[/* f */ js.Array[Any], C]]]
  inline def mapReduce[C](fn1: UnaryFunction, fn2: BinaryFunction, c: C): js.Function1[/* f */ js.Array[Any], C] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Array[Any], C]]
  /**
    * mapReduce :: Foldable f => (a -> b) -> (c -> b -> c) -> c -> f a -> c
    */
  inline def mapReduce[C](fn1: UnaryFunction, fn2: BinaryFunction, c: C, f: js.Array[Any]): C = (^.asInstanceOf[js.Dynamic].applyDynamic("mapReduce")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any], c.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def mconcat(m: js.Object): js.Function1[/* f */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("mconcat")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Object, js.Object]]
  inline def mconcat(m: js.Object, f: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mconcat")(m.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def mconcatMap(m: js.Object): js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mconcatMap")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, js.Object]]]
  inline def mconcatMap(m: js.Object, fn: UnaryFunction): js.Function1[/* f */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("mconcatMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Object, js.Object]]
  /**
    * mconcatMap :: Monoid m, Foldable f => m -> (b -> a) -> f b -> m a
    */
  inline def mconcatMap(m: js.Object, fn: UnaryFunction, f: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mconcatMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def mreduce(m: js.Object): js.Function1[/* f */ js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mreduce")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Object, Any]]
  inline def mreduce(m: js.Object, f: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mreduce")(m.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mreduceMap(m: js.Object): js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mreduceMap")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, Any]]]
  inline def mreduceMap(m: js.Object, fn: UnaryFunction): js.Function1[/* f */ js.Object, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mreduceMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Object, Any]]
  /**
    * mreduceMap :: Monoid m, Foldable f => m -> (b -> a) -> f b -> a
    */
  inline def mreduceMap(m: js.Object, fn: UnaryFunction, f: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mreduceMap")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def nAry(n: Double): js.Function1[/* fn */ VariadicFunction, VariadicFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("nAry")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ VariadicFunction, VariadicFunction]]
  /**
    * nAry :: Number -> ((*) -> a) -> (*) -> a
    */
  inline def nAry(n: Double, fn: VariadicFunction): VariadicFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("nAry")(n.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[VariadicFunction]
  
  inline def objOf[A](k: String): js.Function1[/* a */ A, StringDictionary[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objOf")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StringDictionary[A]]]
  inline def objOf[A](k: String, a: A): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("objOf")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
  
  inline def omit[O, K /* <: String */](ks: js.Array[K]): js.Function1[/* o */ O, Omit[O, K]] = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(ks.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* o */ O, Omit[O, K]]]
  inline def omit[O, K /* <: String */](ks: js.Array[K], o: O): Omit[O, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(ks.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Omit[O, K]]
  
  /**
    * once :: ((*) -> a) -> ((*) -> a)
    */
  inline def once(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
  
  /**
    * partial :: (((*) -> c), *) -> (*) -> c
    */
  inline def partial(fn: VariadicFunction, args: Any*): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(scala.List(fn.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VariadicFunction]
  
  inline def pick[O, K /* <: String */](ks: js.Array[K]): js.Function1[
    /* o */ O, 
    Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pick")(ks.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* o */ O, 
    Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]
  ]]
  inline def pick[O, K /* <: String */](ks: js.Array[K], o: O): Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(ks.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Pick[O, Exclude[/* keyof O */ String, Exclude[/* keyof O */ String, K]]]]
  
  inline def pipe[Z](f: js.Function1[/* repeated */ Any, Any], g: js.Array[js.Function1[/* y */ Any, Z]]): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]
  
  inline def pipeK[Z](f: js.Function1[/* repeated */ Any, Any], g: js.Array[js.Function1[/* y */ Any, Z]]): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeK")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]
  
  inline def pipeP[Z](f: js.Function1[/* repeated */ Any, Any], g: js.Array[js.Function1[/* y */ Any, Z]]): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeP")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]
  
  inline def pipeS[Z](f: js.Function1[/* repeated */ Any, Any], g: js.Array[js.Function1[/* y */ Any, Z]]): Z = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeS")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[Z]
  
  inline def setPath(path: js.Array[String | Double], `val`: Any): js.Function1[/* obj */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
  inline def setPath(path: js.Array[String | Double], `val`: Any, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def setProp(prop: String, `val`: Any): js.Function1[/* obj */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
  inline def setProp(prop: String, `val`: Any, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setProp(prop: Double, `val`: Any): js.Function1[/* obj */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
  inline def setProp(prop: Double, `val`: Any, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def tap[A](fn: js.Function1[/* a */ A, Any]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]
  
  /**
    * tryCatch :: ((*) -> b) -> (*) -> Result e b
    */
  inline def tryCatch(fn: VariadicFunction): VariadicFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(fn.asInstanceOf[js.Any]).asInstanceOf[VariadicFunction]
  
  /**
    * unary :: ((*) -> b) -> a -> b
    */
  inline def unary(fn: VariadicFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("unary")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  
  inline def unit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unit")().asInstanceOf[Unit]
  
  inline def unsetPath(path: js.Array[String | Double]): js.Function1[/* obj */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
  inline def unsetPath(path: js.Array[String | Double], obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetPath")(path.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def unsetProp(prop: String): js.Function1[/* obj */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
  inline def unsetProp(prop: String, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def unsetProp(prop: Double): js.Function1[/* obj */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, js.Object]]
  inline def unsetProp(prop: Double, obj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("unsetProp")(prop.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
