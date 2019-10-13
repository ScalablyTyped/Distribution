package typings.botvs.botvsMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("LogStatus")
@js.native
object LogStatus extends js.Object {
  /**
    * 此信息不保存到日志列表里, 只更新当前机器人的状态信息, 在日志上方显示, 可多次调用, 更新状态
    *
    * * LogStatus('这是一个普通的状态提示');
    * LogStatus('这是一个红色字体的状态提示 #ff0000');
    * LogStatus('这是一个多行的状态信息\n我是第二行');
    * LogStatus支持打印base64编码后的图片, 以"`"开头, 以"`"结尾, 如LogStatus("`data:image/png;base64,AAAA`")
    * LogStatus支持直接传入Python的matplotlib.pyplot对象, 只要对象包含savefig方法就可以传入LogStatus, 如:
    * import matplotlib.pyplot as plt
    * def main():
    * plt.plot([3,6,2,4,7,1])
    * LogStatus(plt)
    * var table = {type: 'table', title: '持仓信息', cols: ['列1', '列2'], rows: [ ['abc', 'def'], ['ABC', 'support color
    * #ff0000']]}; LogStatus('`' + JSON.stringify(table)+'`'); // JSON序列化后两边加上`字符, 视为一个复杂消息格式(当前支持表格)
    * LogStatus('第一行消息\n`' + JSON.stringify(table)+'`\n第三行消息');
    * // 表格信息也可以在多行中出现 LogStatus('`' + JSON.stringify([table,
    * table])+'`'); // 支持多个表格同时显示, 将以TAB显示到一组里
    * // 也可以构造一个按钮在表格中, 策略用GetCommand接收cmd属性的内容
    * var table = {
    *  type: 'table',
    *  title: '持仓操作',
    *  cols: ['列1', '列2', 'Action'],
    *  rows: [
    *      ['abc', 'def', {'type':'button', 'cmd': 'coverAll', 'name': '平仓'}],
    *  ]
    * };
    * LogStatus('`' + JSON.stringify(table) + '`')
    * // 或者构造一单独的按钮
    * LogStatus('`' + JSON.stringify({'type':'button', 'cmd': 'coverAll', 'name': '平仓'}) + '`')
    * // 可以自定义按钮风格(bootstrap的按钮属性)
    * LogStatus('`' + JSON.stringify({'type':'button', 'class': 'btn btn-xs btn-danger', 'cmd': 'coverAll', 'name':
    * '平仓'}) + '`')
    *
    * @param {string} Msg
    */
  def apply(args: js.Any*): Unit = js.native
}

