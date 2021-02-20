package typings.denodeify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply(fn: F): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply(fn: F, transformer: M): js.Function1[/* repeated */ js.Any, js.Promise[_]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, R](fn: F1[A, R]): js.Function1[/* a */ A, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, R](fn: F1[A, R], transformer: M): js.Function1[/* a */ A, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, R](fn: F2[A, B, R]): js.Function2[/* a */ A, /* b */ B, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, R](fn: F2[A, B, R], transformer: M): js.Function2[/* a */ A, /* b */ B, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, R](fn: F3[A, B, C, R]): js.Function3[/* a */ A, /* b */ B, /* c */ C, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, R](fn: F3[A, B, C, R], transformer: M): js.Function3[/* a */ A, /* b */ B, /* c */ C, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, R](fn: F4[A, B, C, D, R]): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, R](fn: F4[A, B, C, D, R], transformer: M): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, R](fn: F5[A, B, C, D, E, R]): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, R](fn: F5[A, B, C, D, E, R], transformer: M): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, F, R](fn: F6[A, B, C, D, E, F, R]): js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, F, R](fn: F6[A, B, C, D, E, F, R], transformer: M): js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, F, G, R](fn: F7[A, B, C, D, E, F, G, R]): js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, F, G, R](fn: F7[A, B, C, D, E, F, G, R], transformer: M): js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* g */ G, js.Promise[R]] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, F, G, H, R](fn: F8[A, B, C, D, E, F, G, H, R]): js.Function8[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* e */ E, 
    /* f */ F, 
    /* g */ G, 
    /* h */ H, 
    js.Promise[R]
  ] = js.native
  @JSImport("denodeify", JSImport.Namespace)
  @js.native
  def apply[A, B, C, D, E, F, G, H, R](fn: F8[A, B, C, D, E, F, G, H, R], transformer: M): js.Function8[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* e */ E, 
    /* f */ F, 
    /* g */ G, 
    /* h */ H, 
    js.Promise[R]
  ] = js.native
  
  type Callback[R] = js.Function2[/* err */ Error, /* result */ R, js.Any]
  
  type F = js.Function1[/* repeated */ js.Any, js.Any]
  
  type F0[R] = js.Function1[/* cb */ Callback[R], js.Any]
  
  type F1[A, R] = js.Function2[/* a */ A, /* cb */ Callback[R], js.Any]
  
  type F2[A, B, R] = js.Function3[/* a */ A, /* b */ B, /* cb */ Callback[R], js.Any]
  
  type F3[A, B, C, R] = js.Function4[/* a */ A, /* b */ B, /* c */ C, /* cb */ Callback[R], js.Any]
  
  type F4[A, B, C, D, R] = js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* cb */ Callback[R], js.Any]
  
  type F5[A, B, C, D, E, R] = js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* cb */ Callback[R], js.Any]
  
  type F6[A, B, C, D, E, F, R] = js.Function7[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, /* cb */ Callback[R], js.Any]
  
  type F7[A, B, C, D, E, F, G, R] = js.Function8[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* e */ E, 
    /* f */ F, 
    /* g */ G, 
    /* cb */ Callback[R], 
    js.Any
  ]
  
  type F8[A, B, C, D, E, F, G, H, R] = js.Function9[
    /* a */ A, 
    /* b */ B, 
    /* c */ C, 
    /* d */ D, 
    /* e */ E, 
    /* f */ F, 
    /* g */ G, 
    /* h */ H, 
    /* cb */ Callback[R], 
    js.Any
  ]
  
  type M = js.Function2[/* err */ Error, /* repeated */ js.Any, js.Array[js.Any]]
}
