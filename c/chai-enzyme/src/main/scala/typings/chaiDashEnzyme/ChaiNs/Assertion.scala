package typings.chaiDashEnzyme.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  /**
    * Assert that the wrapper has given attribute [with value]:
    * @param key
    * @param val
    */
  def attr(key: String): Assertion = js.native
  def attr(key: String, `val`: String): Assertion = js.native
  /**
    * Assert that the given wrapper is empty:
    */
  def blank(): Assertion = js.native
  /**
    * Assert that the given wrapper is checked:
    */
  def checked(): Assertion = js.native
  /**
    * Assert that the wrapper has a given class:
    * @param name
    */
  def className(name: String): Assertion = js.native
  /**
    * Assert that the wrapper contains a certain element:
    * @param selector
    */
  def containMatchingElement(selector: EnzymeSelector): Assertion = js.native
  /**
    * Assert that the wrapper has a given data attribute [with value]:
    * @param key
    * @param val
    */
  def data(key: String): Assertion = js.native
  def data(key: String, `val`: String): Assertion = js.native
  /**
    * Assert that the wrapper contains a descendant matching the given selector:
    * @param selector
    */
  def descendants(): Assertion = js.native
  def descendants(selector: EnzymeSelector): Assertion = js.native
  /**
    * Assert that the given wrapper is disabled:
    */
  def disabled(): Assertion = js.native
  /**
    * Assert that the wrapper contains an exact amount of descendants matching the given selector:
    */
  def exactly(): Assertion = js.native
  def exactly(count: Double): Assertion = js.native
  /**
    * Assert that the wrapper has given html:
    * @param str
    */
  def html(): Assertion = js.native
  def html(str: String): Assertion = js.native
  /**
    * Assert that the wrapper has given ID attribute:
    * @param str
    */
  def id(str: String): Assertion = js.native
  /**
    * Assert that the given wrapper exists:
    */
  def present(): Assertion = js.native
  /**
    * Assert that the wrapper has given prop [with value]:
    * @param key
    * @param val
    */
  def prop(key: String): Assertion = js.native
  def prop(key: String, `val`: js.Any): Assertion = js.native
  /**
    * Assert that the wrapper has given props [with values]:
    * @param keys
    */
  def props(keys: js.Array[String]): Assertion = js.native
  /**
    * Assert that the wrapper has given props [with values]:
    * @param props
    */
  def props(props: EnzymeSelector): Assertion = js.native
  /**
    * Assert that the wrapper has a given ref
    * @param key
    */
  def ref(key: String): Assertion = js.native
  /**
    * Assert that the given wrapper is selected:
    */
  def selected(): Assertion = js.native
  /**
    * Assert that the wrapper has given state [with value]:
    * @param key
    * @param val
    */
  def state(key: String): Assertion = js.native
  def state(key: String, `val`: js.Any): Assertion = js.native
  /**
    * Assert that the wrapper has given style:
    * @param key
    * @param val
    */
  def style(key: String): Assertion = js.native
  def style(key: String, `val`: String): Assertion = js.native
  /**
    * Assert that the given wrapper has the tag name:
    * @param str
    */
  def tagName(str: String): Assertion = js.native
  /**
    * Assert that the given wrapper has the supplied text:
    * @param str
    */
  def text(): Assertion = js.native
  def text(str: String): Assertion = js.native
  /**
    * Assert that the given wrapper has a given type:
    * @param func
    */
  def `type`(func: EnzymeSelector): Assertion = js.native
  /**
    * Assert that the given wrapper has given value:
    * @param str
    */
  def value(str: String): Assertion = js.native
}

