package typings.d

import typings.d.dMod.Flags
import typings.d.dMod.GetSetFlags
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d", JSImport.Namespace)
@js.native
object dMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.d.dMod.GetSetFlags
    - typings.d.dStrings.w
    - typings.d.dStrings.cw
    - typings.d.dStrings.ew
    - typings.d.dStrings.cew
  */
  trait Flags extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.d.dStrings.c
    - typings.d.dStrings.e
    - typings.d.dStrings.ce
  */
  trait GetSetFlags extends Flags
  
  def apply(flags: Flags, value: js.Any): PropertyDescriptor = js.native
  def apply(flags: Flags, value: js.Any, options: PropertyDescriptor): PropertyDescriptor = js.native
  def apply(value: js.Any): PropertyDescriptor = js.native
  def apply(value: js.Any, options: PropertyDescriptor): PropertyDescriptor = js.native
  def gs(flags: GetSetFlags, get: js.UndefOr[scala.Nothing], set: js.Function1[/* repeated */ js.Any, _]): PropertyDescriptor = js.native
  def gs(
    flags: GetSetFlags,
    get: js.UndefOr[scala.Nothing],
    set: js.Function1[/* repeated */ js.Any, _],
    options: PropertyDescriptor
  ): PropertyDescriptor = js.native
  def gs(flags: GetSetFlags, get: js.Function1[/* repeated */ js.Any, _]): PropertyDescriptor = js.native
  def gs(flags: GetSetFlags, get: js.Function1[/* repeated */ js.Any, _], options: PropertyDescriptor): PropertyDescriptor = js.native
  def gs(
    flags: GetSetFlags,
    get: js.Function1[/* repeated */ js.Any, _],
    set: js.Function1[/* repeated */ js.Any, _]
  ): PropertyDescriptor = js.native
  def gs(
    flags: GetSetFlags,
    get: js.Function1[/* repeated */ js.Any, _],
    set: js.Function1[/* repeated */ js.Any, _],
    options: PropertyDescriptor
  ): PropertyDescriptor = js.native
  def gs(
    flags: GetSetFlags,
    get: js.Function1[/* repeated */ js.Any, _],
    set: Null,
    options: PropertyDescriptor
  ): PropertyDescriptor = js.native
  def gs(flags: GetSetFlags, get: Null, set: js.Function1[/* repeated */ js.Any, _]): PropertyDescriptor = js.native
  def gs(
    flags: GetSetFlags,
    get: Null,
    set: js.Function1[/* repeated */ js.Any, _],
    options: PropertyDescriptor
  ): PropertyDescriptor = js.native
  def gs(flags: GetSetFlags, options: PropertyDescriptor): PropertyDescriptor = js.native
  def gs(get: js.UndefOr[scala.Nothing], set: js.Function1[/* repeated */ js.Any, _]): PropertyDescriptor = js.native
  def gs(
    get: js.UndefOr[scala.Nothing],
    set: js.Function1[/* repeated */ js.Any, _],
    options: PropertyDescriptor
  ): PropertyDescriptor = js.native
  def gs(get: js.Function1[/* repeated */ js.Any, _]): PropertyDescriptor = js.native
  def gs(get: js.Function1[/* repeated */ js.Any, _], set: js.Function1[/* repeated */ js.Any, _]): PropertyDescriptor = js.native
  def gs(
    get: js.Function1[/* repeated */ js.Any, _],
    set: js.Function1[/* repeated */ js.Any, _],
    options: PropertyDescriptor
  ): PropertyDescriptor = js.native
  def gs(get: js.Function1[/* repeated */ js.Any, _], set: Null, options: PropertyDescriptor): PropertyDescriptor = js.native
  def gs(get: Null, set: js.Function1[/* repeated */ js.Any, _]): PropertyDescriptor = js.native
  def gs(get: Null, set: js.Function1[/* repeated */ js.Any, _], options: PropertyDescriptor): PropertyDescriptor = js.native
}

