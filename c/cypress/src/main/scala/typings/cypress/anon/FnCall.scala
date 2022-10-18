package typings.cypress.anon

import typings.cypress.typesBluebirdMod.Bluebird
import typings.cypress.typesBluebirdMod.CatchFilter
import typings.cypress.typesBluebirdMod.Constructor
import typings.cypress.typesBluebirdMod.Resolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall[R] extends StObject {
  
  def apply[U](): Bluebird[U | R] = js.native
  def apply[U](onReject: js.Function1[/* error */ Any, Resolvable[U]]): Bluebird[U | R] = js.native
  def apply[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | R] = js.native
  def apply[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: CatchFilter[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: CatchFilter[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: CatchFilter[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: CatchFilter[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: Constructor[E1],
    filter2: Constructor[E2],
    filter3: Constructor[E3],
    filter4: Constructor[E4],
    filter5: Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
  ): Bluebird[U | R] = js.native
}
