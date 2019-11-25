package typings.cordovaDotPluginsDotDiagnostic

import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.ACCESS_COARSE_LOCATION
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.ACCESS_FINE_LOCATION
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.ADD_VOICEMAIL
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.BODY_SENSORS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.CALL_PHONE
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.CAMERA
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.GET_ACCOUNTS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.PROCESS_OUTGOING_CALLS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.READ_CALENDAR
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.READ_CALL_LOG
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.READ_CONTACTS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.READ_EXTERNAL_STORAGE
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.READ_PHONE_STATE
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.READ_SMS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.RECEIVE_MMS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.RECEIVE_SMS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.RECEIVE_WAP_PUSH
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.RECORD_AUDIO
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.SEND_SMS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.USE_SIP
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.WRITE_CALENDAR
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.WRITE_CALL_LOG
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.WRITE_CONTACTS
import typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.WRITE_EXTERNAL_STORAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ACCESSCOARSELOCATIONACCESSFINELOCATION extends js.Object {
  var CALENDAR: js.Tuple2[READ_CALENDAR, WRITE_CALENDAR]
  var CAMERA: js.Array[
    typings.cordovaDotPluginsDotDiagnostic.cordovaDotPluginsDotDiagnosticStrings.CAMERA
  ]
  var CONTACTS: js.Tuple3[READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS]
  var LOCATION: js.Tuple2[ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION]
  var MICROPHONE: js.Array[RECORD_AUDIO]
  var PHONE: js.Tuple7[
    READ_PHONE_STATE, 
    CALL_PHONE, 
    ADD_VOICEMAIL, 
    USE_SIP, 
    PROCESS_OUTGOING_CALLS, 
    READ_CALL_LOG, 
    WRITE_CALL_LOG
  ]
  var SENSORS: js.Array[BODY_SENSORS]
  var SMS: js.Tuple5[SEND_SMS, RECEIVE_SMS, READ_SMS, RECEIVE_WAP_PUSH, RECEIVE_MMS]
  var STORAGE: js.Tuple2[READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE]
}

object Anon_ACCESSCOARSELOCATIONACCESSFINELOCATION {
  @scala.inline
  def apply(
    CALENDAR: js.Tuple2[READ_CALENDAR, WRITE_CALENDAR],
    CAMERA: js.Array[CAMERA],
    CONTACTS: js.Tuple3[READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS],
    LOCATION: js.Tuple2[ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION],
    MICROPHONE: js.Array[RECORD_AUDIO],
    PHONE: js.Tuple7[
      READ_PHONE_STATE, 
      CALL_PHONE, 
      ADD_VOICEMAIL, 
      USE_SIP, 
      PROCESS_OUTGOING_CALLS, 
      READ_CALL_LOG, 
      WRITE_CALL_LOG
    ],
    SENSORS: js.Array[BODY_SENSORS],
    SMS: js.Tuple5[SEND_SMS, RECEIVE_SMS, READ_SMS, RECEIVE_WAP_PUSH, RECEIVE_MMS],
    STORAGE: js.Tuple2[READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE]
  ): Anon_ACCESSCOARSELOCATIONACCESSFINELOCATION = {
    val __obj = js.Dynamic.literal(CALENDAR = CALENDAR.asInstanceOf[js.Any], CAMERA = CAMERA.asInstanceOf[js.Any], CONTACTS = CONTACTS.asInstanceOf[js.Any], LOCATION = LOCATION.asInstanceOf[js.Any], MICROPHONE = MICROPHONE.asInstanceOf[js.Any], PHONE = PHONE.asInstanceOf[js.Any], SENSORS = SENSORS.asInstanceOf[js.Any], SMS = SMS.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ACCESSCOARSELOCATIONACCESSFINELOCATION]
  }
}

