package typings.cypress.Cypress

import typings.cypress.anon.PartialEnqueuedCommandAtt
import typings.cypress.cypressStrings.`type`
import typings.cypress.cypressStrings.args
import typings.cypress.cypressStrings.chainerId
import typings.cypress.cypressStrings.id
import typings.cypress.cypressStrings.injected
import typings.cypress.cypressStrings.name
import typings.cypress.cypressStrings.query
import typings.cypress.cypressStrings.userInvocationStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  def get(): EnqueuedCommandAttributes = js.native
  @JSName("get")
  def get_args(attr: args): js.Array[Any] = js.native
  @JSName("get")
  def get_chainerId(attr: chainerId): String = js.native
  @JSName("get")
  def get_id(attr: id): String = js.native
  @JSName("get")
  def get_injected(attr: injected): Boolean = js.native
  @JSName("get")
  def get_name(attr: name): String = js.native
  @JSName("get")
  def get_query(attr: query): js.UndefOr[Boolean] = js.native
  @JSName("get")
  def get_type(attr: `type`): String = js.native
  @JSName("get")
  def get_userInvocationStack(attr: userInvocationStack): js.UndefOr[String] = js.native
  
  def set(options: PartialEnqueuedCommandAtt): Log = js.native
  @JSName("set")
  def set_args(key: args, value: js.Array[Any]): Log = js.native
  @JSName("set")
  def set_chainerId(key: chainerId, value: String): Log = js.native
  @JSName("set")
  def set_id(key: id, value: String): Log = js.native
  @JSName("set")
  def set_injected(key: injected, value: Boolean): Log = js.native
  @JSName("set")
  def set_name(key: name, value: String): Log = js.native
  @JSName("set")
  def set_query(key: query): Log = js.native
  @JSName("set")
  def set_query(key: query, value: Boolean): Log = js.native
  @JSName("set")
  def set_type(key: `type`, value: String): Log = js.native
  @JSName("set")
  def set_userInvocationStack(key: userInvocationStack): Log = js.native
  @JSName("set")
  def set_userInvocationStack(key: userInvocationStack, value: String): Log = js.native
}
