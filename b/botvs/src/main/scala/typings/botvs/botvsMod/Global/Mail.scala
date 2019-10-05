package typings.botvs.botvsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mail")
@js.native
object Mail extends js.Object {
  /**
    * 发送邮件函数
    *
    * Mail(smtpServer, smtpUsername, smtpPassword, mailTo, title, body); ret true or false
    * Mail("smtp.163.com", "asdf@163.com", "password", "111@163.com", "title", "body")
    *
    * @param {string} smtpServer
    * @param {string} smtpUsername
    * @param {string} smtpPassword
    * @param {string} mailTo
    * @param {string} title
    * @param {string} body
    * @return {boolean}
    */
  def apply(
    smtpServer: String,
    smtpUsername: String,
    smtpPassword: String,
    mailTo: String,
    title: String,
    body: String
  ): Boolean = js.native
}

