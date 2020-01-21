package typings.beanstalkd.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdProtocol extends js.Object {
  def add(signature: String, key: String): Unit
  def addCommand(signature: String): Unit
  def addReply(signature: String): Unit
  def addType(key: String, `type`: js.Any): Unit
  def build(identifier: String, args: js.Array[_], key: String): Buffer
  def buildCommand(command: String, args: js.Array[_]): Buffer
  def buildPut(args: js.Array[_]): Buffer
  def buildreply(reply: String, args: js.Array[_]): Buffer
  def parse(buffer: Buffer, key: String): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null]
  def parseCommand(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null]
  def parseReply(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null]
  def reset(): Unit
}

object BeanstalkdProtocol {
  @scala.inline
  def apply(
    add: (String, String) => Unit,
    addCommand: String => Unit,
    addReply: String => Unit,
    addType: (String, js.Any) => Unit,
    build: (String, js.Array[_], String) => Buffer,
    buildCommand: (String, js.Array[_]) => Buffer,
    buildPut: js.Array[_] => Buffer,
    buildreply: (String, js.Array[_]) => Buffer,
    parse: (Buffer, String) => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null],
    parseCommand: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null],
    parseReply: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null],
    reset: () => Unit
  ): BeanstalkdProtocol = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addCommand = js.Any.fromFunction1(addCommand), addReply = js.Any.fromFunction1(addReply), addType = js.Any.fromFunction2(addType), build = js.Any.fromFunction3(build), buildCommand = js.Any.fromFunction2(buildCommand), buildPut = js.Any.fromFunction1(buildPut), buildreply = js.Any.fromFunction2(buildreply), parse = js.Any.fromFunction2(parse), parseCommand = js.Any.fromFunction1(parseCommand), parseReply = js.Any.fromFunction1(parseReply), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[BeanstalkdProtocol]
  }
}

