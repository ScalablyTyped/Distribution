package typings.beanstalkd.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdProtocol extends js.Object {
  def add(signature: String, key: String): Unit = js.native
  def addCommand(signature: String): Unit = js.native
  def addReply(signature: String): Unit = js.native
  def addType(key: String, `type`: js.Any): Unit = js.native
  def build(identifier: String, args: js.Array[_], key: String): Buffer = js.native
  def buildCommand(command: String, args: js.Array[_]): Buffer = js.native
  def buildPut(args: js.Array[_]): Buffer = js.native
  def buildreply(reply: String, args: js.Array[_]): Buffer = js.native
  def parse(buffer: Buffer, key: String): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null] = js.native
  def parseCommand(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null] = js.native
  def parseReply(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null] = js.native
  def reset(): Unit = js.native
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
  @scala.inline
  implicit class BeanstalkdProtocolOps[Self <: BeanstalkdProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (String, String) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setAddCommand(value: String => Unit): Self = this.set("addCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setAddReply(value: String => Unit): Self = this.set("addReply", js.Any.fromFunction1(value))
    @scala.inline
    def setAddType(value: (String, js.Any) => Unit): Self = this.set("addType", js.Any.fromFunction2(value))
    @scala.inline
    def setBuild(value: (String, js.Array[_], String) => Buffer): Self = this.set("build", js.Any.fromFunction3(value))
    @scala.inline
    def setBuildCommand(value: (String, js.Array[_]) => Buffer): Self = this.set("buildCommand", js.Any.fromFunction2(value))
    @scala.inline
    def setBuildPut(value: js.Array[_] => Buffer): Self = this.set("buildPut", js.Any.fromFunction1(value))
    @scala.inline
    def setBuildreply(value: (String, js.Array[_]) => Buffer): Self = this.set("buildreply", js.Any.fromFunction2(value))
    @scala.inline
    def setParse(
      value: (Buffer, String) => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null]
    ): Self = this.set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def setParseCommand(value: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null]): Self = this.set("parseCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setParseReply(value: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null]): Self = this.set("parseReply", js.Any.fromFunction1(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

