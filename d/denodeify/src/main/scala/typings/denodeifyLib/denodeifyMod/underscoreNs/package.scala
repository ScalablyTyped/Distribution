package typings
package denodeifyLib.denodeifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreNs {
  type Callback[R] = js.Function2[/* err */ stdLib.Error, /* result */ R, js.Any]
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
  type M = js.Function2[/* err */ stdLib.Error, /* repeated */ js.Any, js.Array[js.Any]]
}
